import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords

import groovy.json.JsonSlurper

String categoryId = "3"

RequestObject request = findTestObject('Object Repository/Authorize')
ResponseObject response = WSBuiltInKeywords.sendRequest(request)

JsonSlurper slurper = new JsonSlurper()
Map parsedJson = slurper.parseText(response.getResponseBodyContent())

String token = parsedJson.access_token

ArrayList HTTPHeader = new ArrayList()

HTTPHeader.add(new TestObjectProperty('Authorization', ConditionType.EQUALS, 'Bearer ' + token))
RequestObject request2 = findTestObject('Object Repository/GET parameters supported by a category/GetParametersSupportedByCategory', ["id" : categoryId])
request2.setHttpHeaderProperties(HTTPHeader)

ResponseObject response2 = WSBuiltInKeywords.sendRequest(request2)

println(response2.getResponseBodyContent())

WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.variantsAllowed', 'false')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.variantsEqual', 'true')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.ambiguousValueId', 'null')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.dependsOnParameterId', 'null')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.describesProduct', 'false')
WSBuiltInKeywords.verifyElementPropertyValue(response2, 'parameters[0].options.customValuesEnabled', 'false')
