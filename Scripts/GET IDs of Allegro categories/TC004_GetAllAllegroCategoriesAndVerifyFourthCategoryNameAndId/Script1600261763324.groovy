import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords

import groovy.json.JsonSlurper


RequestObject request = findTestObject('Object Repository/Authorize')
ResponseObject response = WSBuiltInKeywords.sendRequest(request)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseBodyContent())

String token = parsedJson.access_token

ArrayList HTTPHeader = new ArrayList()

HTTPHeader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token))
RequestObject request2 = findTestObject('GET IDs of Allegro categories/GetAllCategories')
request2.setHttpHeaderProperties(HTTPHeader)

ResponseObject response2 = WSBuiltInKeywords.sendRequest(request2)

println(response2.getResponseBodyContent())

WSBuiltInKeywords.verifyElementPropertyValue(response2, 'categories[3].id', '4bd97d96-f0ff-46cb-a52c-2992bd972bb1')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'categories[3].name', 'Firma i usługi')
