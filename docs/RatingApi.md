# RatingApi

All URIs are relative to *https://api-developer.mcc.it/api/v2/rating*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calcoloRatingCF**](RatingApi.md#calcoloRatingCF) | **POST** /codicefiscale | Calcola il Rating con il Codice Fiscale
[**calcoloRatingCF2**](RatingApi.md#calcoloRatingCF2) | **POST** /codicefiscale2 | Calcola il Rating con il Codice Fiscale e opzionali i dati Credit Bureau, Centrale Rischi ed eventi pregiudizievoli
[**calcoloRatingXBRL**](RatingApi.md#calcoloRatingXBRL) | **POST** /xbrl | Calcola il Rating con il file XBRL
[**calcoloRatingXML**](RatingApi.md#calcoloRatingXML) | **POST** /xml | Calcola il Rating con il file XML

<a name="calcoloRatingCF"></a>
# **calcoloRatingCF**
> RatingOutputModel calcoloRatingCF(authorization, body)

Calcola il Rating con il Codice Fiscale

Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api è necessario il solo codice fiscale dell&#x27;impresa, sono invece opzionali l&#x27;esercizio finanziario per l&#x27;estrazione dei bilanci e la data di esecuzione del calcolo.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RatingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

RatingApi apiInstance = new RatingApi();
String authorization = "authorization_example"; // String | basic auth token
RatingModelCF body = new RatingModelCF(); // RatingModelCF | ratingModelCF
try {
    RatingOutputModel result = apiInstance.calcoloRatingCF(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#calcoloRatingCF");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| basic auth token |
 **body** | [**RatingModelCF**](RatingModelCF.md)| ratingModelCF | [optional]

### Return type

[**RatingOutputModel**](RatingOutputModel.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calcoloRatingCF2"></a>
# **calcoloRatingCF2**
> RatingOutputModelXbrl calcoloRatingCF2(authorization, body)

Calcola il Rating con il Codice Fiscale e opzionali i dati Credit Bureau, Centrale Rischi ed eventi pregiudizievoli

Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali. E&#x27; possibile specificare in input anche i dati dati di Credit Bureau, Centrale Rischi ed eventi pregiudizievoli. Il servizio restituisce i dati del calcolo del Rating ed il bilancio utilizzato per effettuare la valutazione in formato xbrl.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RatingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

RatingApi apiInstance = new RatingApi();
String authorization = "authorization_example"; // String | basic auth token
Object body = null; // Object | Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli
try {
    RatingOutputModelXbrl result = apiInstance.calcoloRatingCF2(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#calcoloRatingCF2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| basic auth token |
 **body** | [**Object**](Object.md)| Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli | [optional]

### Return type

[**RatingOutputModelXbrl**](RatingOutputModelXbrl.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calcoloRatingXBRL"></a>
# **calcoloRatingXBRL**
> RatingOutputModel calcoloRatingXBRL(authorization, body)

Calcola il Rating con il file XBRL

Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api, oltre alle informazioni anagrafiche dell&#x27;azienda, sono necessair i bilanci defli ultimi due anni in formato XRBL.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RatingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

RatingApi apiInstance = new RatingApi();
String authorization = "authorization_example"; // String | basic auth token
RatingModelXBRL body = new RatingModelXBRL(); // RatingModelXBRL | ratingModelXBRL
try {
    RatingOutputModel result = apiInstance.calcoloRatingXBRL(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#calcoloRatingXBRL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| basic auth token |
 **body** | [**RatingModelXBRL**](RatingModelXBRL.md)| ratingModelXBRL | [optional]

### Return type

[**RatingOutputModel**](RatingOutputModel.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="calcoloRatingXML"></a>
# **calcoloRatingXML**
> RatingOutputModel calcoloRatingXML(authorization, body)

Calcola il Rating con il file XML

Il servizio permette di rendere fruibili i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  Download: &lt;a href&#x3D;\&quot;https://mccfilehostingprod.blob.core.windows.net/api-rating/MCC_Rating_Xml_Validazione.xsd?sp&#x3D;r&amp;st&#x3D;2021-05-28T07:53:47Z&amp;se&#x3D;2021-05-28T15:53:47Z&amp;spr&#x3D;https&amp;sv&#x3D;2020-02-10&amp;sr&#x3D;b&amp;sig&#x3D;mZyLWw%2F7QyEeDzbd8i6%2Bnexr4K6CdRFsTl6gXaTPQb0%3D\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Bilancio XSD&lt;/a&gt;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RatingApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: apiKeyHeader
ApiKeyAuth apiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyHeader");
apiKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyHeader.setApiKeyPrefix("Token");

// Configure API key authorization: apiKeyQuery
ApiKeyAuth apiKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyQuery");
apiKeyQuery.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKeyQuery.setApiKeyPrefix("Token");

RatingApi apiInstance = new RatingApi();
String authorization = "authorization_example"; // String | basic auth token
RatingModelXML body = new RatingModelXML(); // RatingModelXML | ratingModelXML
try {
    RatingOutputModel result = apiInstance.calcoloRatingXML(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingApi#calcoloRatingXML");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| basic auth token |
 **body** | [**RatingModelXML**](RatingModelXML.md)| ratingModelXML | [optional]

### Return type

[**RatingOutputModel**](RatingOutputModel.md)

### Authorization

[apiKeyHeader](../README.md#apiKeyHeader)[apiKeyQuery](../README.md#apiKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

