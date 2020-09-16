# Sample_REST_Api_Tests

Uruchomienie projektu (środowisko Windows):
1.	przed uruchomieniem Katalon Studio wymagana jest zainstalowana java
2.	rejestrujemy się na stronie https://www.katalon.com/sign-up/
3.	po zarejestrowaniu pobieramy Katalon studio dla właściwej wersji sytemu ze strony https://www.katalon.com/download/ (jest to wersja Standard - darmowa)
4.	jeśli nie mamy zainstalowanego pobieramy git for windows ze strony https://gitforwindows.org/, w celu późniejszego pobrania projektu z gita przez Katalon Studio (jest wymagany)
5.	po pobraniu paczki rozpakowujemy ją i uruchamiamy plik katalon.exe
6.	po uruchomieniu Katalon Studio poprosi o podanie danych podanych podczas zakładania konta na stronie katalon w celu aktywacji programu (tylko przy pierwszym uruchomieniu)
7.	po aktywacji programu zamykamy okno powitalne
8.	włączmy możliwość korzystania z gita z poziomu Katalona, na górnym pasku programu klikamy zakładkę Window -> Katalon Studio Preferences -> w nowo otwartym oknie w sekcji po lewej stronie klikamy Katalon -> po rozwinięciu sekcji Katalon klikamy Git -> zaznaczmy w sekcji po prawej checkboxa Enable Git Integration -> Apply -> OK
9.	pod zakładka Debug na górnym pasku programu powinna znaleźć się czerwona ikona Gita, klikamy po jej prawej stronie w czarną strzałkę, która rozwija opcję, wybieramy Clone Project, kreator prowadzi do zakończenia procesu klonowania repo z git
10.	po zakończeniu klonowania program załaduje automatycznie sklonowany projekt
11.	aby uruchomić testy należy z sekcji po lewej stronie wybrać folder Test Suites -> podwójne kliknięcie myszki na Sample Test Suite Collection
12.	w sekcji po prawej otworzy się kolekcja, aby uruchomić testy należy kliknąć Execute w górnej sekcji okna kolekcji, w przypadku gdyby nie było przycisku Execute należy przełączyć kolekcje do sekcji Main, nalezy kliknąć przycisk Main znajdujący się w lewej dolnej części okna kolekcji
13.	koniec :)
14.	przypadki testowe znajdują się w folderze Test Cases w odpowiednich katalogach
15.	aby uruchomić dany test otwieramy go podwójnym kliknięciem na nim i klikamy dużą zieloną ikonę Play w prawej górnej sekcji programu
16.	każdy test otwiera się w widoku Manual zalecane jest przełączenie się na widok Script, po otwarciu danego testu w lewej dolnej części okna testu jest przycisk Script, pozwalający na przełączenie się do trybu skryptowego
17.	obiekty testowe znajdują się w folderze Object Repository w odpowiednim katalogu
