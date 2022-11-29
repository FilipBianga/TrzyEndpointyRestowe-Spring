<h1>Zadania rekrutacyjne</h1>
<hr>
<p><strong>Zadanie 1. Aplikacja RESTowa – Java, Spring, Gradle</strong></p>
<p>Celem zadania jest wykorzystanie frameworka spring oraz gradle lub maven do stworzenia aplikacji
obsługującej 3 endpointy restowe.
<p><strong>Endpoint 1.</strong> GET na ścieżce /status/ping nie przyjmujący żadnych parametrów, który odpowiada na
sztywno stringiem „pong”</p>
<p><strong>Endpoint 2.</strong> POST na ścieżce /numbers/sort-command umożliwiający sortowanie liczb. Endpoint
przyjmuje jako body obiekt zawierający listę liczb do posortowania oraz informacje czy sortowanie
ma być rosnące czy malejące. Jako odpowiedź zwraca odpowiedni kod http oraz obiekt zawierający
posortowaną listę liczb</p>
Przykładowe body:<br>
{<br>
&emsp;&emsp;numbers: [1, 5, 3, 9, 7],<br>
&emsp;&emsp;order: ”ASC”<br>
}<br><br>
Odpowiedź:<br>
{<br>
&emsp;&emsp;numbers: [1, 3, 5, 7, 9]<br>
}<br><br>
Uwagi:<br>
- pole numbers może być puste lub może przyjąć wartość null<br>
- pole order przyjmuje wartości ASC oraz DESC<br>
- w przypadku błędnych danych aplikacja powinna zwrócić odpowiedni kod http<br><br>
<p><strong>Endpoint 3.</strong> POST na ścieżce /currencies/get-current-currency-value-command umożliwiający
pobranie z NBP aktualny kurs danej waluty. Endpoint przyjmuje jako body obiekt zawierający kod
waluty. Jako odpowiedź zwraca odpowiedni kod http oraz obiekt zawierający informacje o
aktualnym kursie waluty.</p>
Przykładowe body:<br>
{<br>
&emsp;&emsp;currency: ”EUR”<br>
}<br><br>
Odpowiedź:<br>
{<br>
&emsp;&emsp;value: 4.2954<br>
}<br><br>
Uwagi:

- zadaniem aplikacji jest połączyć się z NBP po API dostępnym pod adresem http://api.nbp.pl/ (dla
  ułatwienia chodzi o konkretny endpoint pod adresem http://api.nbp.pl/api/exchangerates/tables/A?
  format=json). Następnie pobrać kurs waluty zgodnie z parametrem z żądania i zwrócić jego wartość
- w przypadku podania nieistniejącej waluty należy zwrócić odpowiedni kod oraz wyjątek
<br><br>
<p><strong>Zadanie 2. Front end webowy – Javascript, Angular</strong></p>
Celem zadania jest wykorzystanie frameworka Angular do stworzenia prostego interfejsu
webowego (strony html) umożliwiającej wprowadzenia listy liczb. Strona ma umożliwiać
następnie:
- przesłanie liczb do stworzonego w poprzednim zadaniu endpointu, który je posortuje
- wyświetlenie wyniku
  Wygląd interfejsu może być dowolny, może to być jedno pole, może być więcej.