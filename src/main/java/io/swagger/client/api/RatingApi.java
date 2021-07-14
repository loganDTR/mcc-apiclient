/*
 * Calcola il Rating del Fondo di Garanzia
 * Calcola il tuo Rating e verifica l'idoneità al Fondo di Garanzia
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.RatingModelCF;
import io.swagger.client.model.RatingModelXBRL;
import io.swagger.client.model.RatingModelXML;
import io.swagger.client.model.RatingOutputModel;
import io.swagger.client.model.RatingOutputModelXbrl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingApi {
    private ApiClient apiClient;

    public RatingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RatingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for calcoloRatingCF
     * @param authorization basic auth token (required)
     * @param body ratingModelCF (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingCFCall(String authorization, RatingModelCF body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/codicefiscale";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calcoloRatingCFValidateBeforeCall(String authorization, RatingModelCF body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling calcoloRatingCF(Async)");
        }
        
        com.squareup.okhttp.Call call = calcoloRatingCFCall(authorization, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calcola il Rating con il Codice Fiscale
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api è necessario il solo codice fiscale dell&#x27;impresa, sono invece opzionali l&#x27;esercizio finanziario per l&#x27;estrazione dei bilanci e la data di esecuzione del calcolo.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelCF (optional)
     * @return RatingOutputModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatingOutputModel calcoloRatingCF(String authorization, RatingModelCF body) throws ApiException {
        ApiResponse<RatingOutputModel> resp = calcoloRatingCFWithHttpInfo(authorization, body);
        return resp.getData();
    }

    /**
     * Calcola il Rating con il Codice Fiscale
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api è necessario il solo codice fiscale dell&#x27;impresa, sono invece opzionali l&#x27;esercizio finanziario per l&#x27;estrazione dei bilanci e la data di esecuzione del calcolo.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelCF (optional)
     * @return ApiResponse&lt;RatingOutputModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatingOutputModel> calcoloRatingCFWithHttpInfo(String authorization, RatingModelCF body) throws ApiException {
        com.squareup.okhttp.Call call = calcoloRatingCFValidateBeforeCall(authorization, body, null, null);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calcola il Rating con il Codice Fiscale (asynchronously)
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api è necessario il solo codice fiscale dell&#x27;impresa, sono invece opzionali l&#x27;esercizio finanziario per l&#x27;estrazione dei bilanci e la data di esecuzione del calcolo.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelCF (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingCFAsync(String authorization, RatingModelCF body, final ApiCallback<RatingOutputModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calcoloRatingCFValidateBeforeCall(authorization, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for calcoloRatingCF2
     * @param authorization basic auth token (required)
     * @param body Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingCF2Call(String authorization, Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/codicefiscale2";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calcoloRatingCF2ValidateBeforeCall(String authorization, Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling calcoloRatingCF2(Async)");
        }
        
        com.squareup.okhttp.Call call = calcoloRatingCF2Call(authorization, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calcola il Rating con il Codice Fiscale e opzionali i dati Credit Bureau, Centrale Rischi ed eventi pregiudizievoli
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali. E&#x27; possibile specificare in input anche i dati dati di Credit Bureau, Centrale Rischi ed eventi pregiudizievoli. Il servizio restituisce i dati del calcolo del Rating ed il bilancio utilizzato per effettuare la valutazione in formato xbrl.
     * @param authorization basic auth token (required)
     * @param body Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli (optional)
     * @return RatingOutputModelXbrl
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatingOutputModelXbrl calcoloRatingCF2(String authorization, Object body) throws ApiException {
        ApiResponse<RatingOutputModelXbrl> resp = calcoloRatingCF2WithHttpInfo(authorization, body);
        return resp.getData();
    }

    /**
     * Calcola il Rating con il Codice Fiscale e opzionali i dati Credit Bureau, Centrale Rischi ed eventi pregiudizievoli
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali. E&#x27; possibile specificare in input anche i dati dati di Credit Bureau, Centrale Rischi ed eventi pregiudizievoli. Il servizio restituisce i dati del calcolo del Rating ed il bilancio utilizzato per effettuare la valutazione in formato xbrl.
     * @param authorization basic auth token (required)
     * @param body Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli (optional)
     * @return ApiResponse&lt;RatingOutputModelXbrl&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatingOutputModelXbrl> calcoloRatingCF2WithHttpInfo(String authorization, Object body) throws ApiException {
        com.squareup.okhttp.Call call = calcoloRatingCF2ValidateBeforeCall(authorization, body, null, null);
        Type localVarReturnType = new TypeToken<RatingOutputModelXbrl>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calcola il Rating con il Codice Fiscale e opzionali i dati Credit Bureau, Centrale Rischi ed eventi pregiudizievoli (asynchronously)
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali. E&#x27; possibile specificare in input anche i dati dati di Credit Bureau, Centrale Rischi ed eventi pregiudizievoli. Il servizio restituisce i dati del calcolo del Rating ed il bilancio utilizzato per effettuare la valutazione in formato xbrl.
     * @param authorization basic auth token (required)
     * @param body Input Codice Fiscale ed opzionali dati Credit Bureau, Central Rischi ed eventi pregiudizievoli (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingCF2Async(String authorization, Object body, final ApiCallback<RatingOutputModelXbrl> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calcoloRatingCF2ValidateBeforeCall(authorization, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatingOutputModelXbrl>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for calcoloRatingXBRL
     * @param authorization basic auth token (required)
     * @param body ratingModelXBRL (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingXBRLCall(String authorization, RatingModelXBRL body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/xbrl";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calcoloRatingXBRLValidateBeforeCall(String authorization, RatingModelXBRL body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling calcoloRatingXBRL(Async)");
        }
        
        com.squareup.okhttp.Call call = calcoloRatingXBRLCall(authorization, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calcola il Rating con il file XBRL
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api, oltre alle informazioni anagrafiche dell&#x27;azienda, sono necessair i bilanci defli ultimi due anni in formato XRBL.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelXBRL (optional)
     * @return RatingOutputModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatingOutputModel calcoloRatingXBRL(String authorization, RatingModelXBRL body) throws ApiException {
        ApiResponse<RatingOutputModel> resp = calcoloRatingXBRLWithHttpInfo(authorization, body);
        return resp.getData();
    }

    /**
     * Calcola il Rating con il file XBRL
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api, oltre alle informazioni anagrafiche dell&#x27;azienda, sono necessair i bilanci defli ultimi due anni in formato XRBL.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelXBRL (optional)
     * @return ApiResponse&lt;RatingOutputModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatingOutputModel> calcoloRatingXBRLWithHttpInfo(String authorization, RatingModelXBRL body) throws ApiException {
        com.squareup.okhttp.Call call = calcoloRatingXBRLValidateBeforeCall(authorization, body, null, null);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calcola il Rating con il file XBRL (asynchronously)
     * Il servizio permette di rendere fruibili, per le sole società di capitali, i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  In input all&#x27;api, oltre alle informazioni anagrafiche dell&#x27;azienda, sono necessair i bilanci defli ultimi due anni in formato XRBL.  Per il significato degli indicatori presenti nell&#x27;output si rimanda alle &lt;a target &#x3D;\&quot;_blank\&quot; href &#x3D; \&quot;http://www.fondidigaranzia.it/wp-content/uploads/2019/02/D.O.-riforma-20190213-con-nuove-sezioni.pdf\&quot; &gt;disposizioni operative del fondo. Parte IX - MODULO ECONOMICO – FINANZIARIO e ANDAMENTALE”&lt;/a&gt; 
     * @param authorization basic auth token (required)
     * @param body ratingModelXBRL (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingXBRLAsync(String authorization, RatingModelXBRL body, final ApiCallback<RatingOutputModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calcoloRatingXBRLValidateBeforeCall(authorization, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for calcoloRatingXML
     * @param authorization basic auth token (required)
     * @param body ratingModelXML (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingXMLCall(String authorization, RatingModelXML body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/xml";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeyHeader", "apiKeyQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call calcoloRatingXMLValidateBeforeCall(String authorization, RatingModelXML body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling calcoloRatingXML(Async)");
        }
        
        com.squareup.okhttp.Call call = calcoloRatingXMLCall(authorization, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Calcola il Rating con il file XML
     * Il servizio permette di rendere fruibili i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  Download: &lt;a href&#x3D;\&quot;https://mccfilehostingprod.blob.core.windows.net/api-rating/MCC_Rating_Xml_Validazione.xsd?sp&#x3D;r&amp;st&#x3D;2021-05-28T07:53:47Z&amp;se&#x3D;2021-05-28T15:53:47Z&amp;spr&#x3D;https&amp;sv&#x3D;2020-02-10&amp;sr&#x3D;b&amp;sig&#x3D;mZyLWw%2F7QyEeDzbd8i6%2Bnexr4K6CdRFsTl6gXaTPQb0%3D\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Bilancio XSD&lt;/a&gt;
     * @param authorization basic auth token (required)
     * @param body ratingModelXML (optional)
     * @return RatingOutputModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatingOutputModel calcoloRatingXML(String authorization, RatingModelXML body) throws ApiException {
        ApiResponse<RatingOutputModel> resp = calcoloRatingXMLWithHttpInfo(authorization, body);
        return resp.getData();
    }

    /**
     * Calcola il Rating con il file XML
     * Il servizio permette di rendere fruibili i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  Download: &lt;a href&#x3D;\&quot;https://mccfilehostingprod.blob.core.windows.net/api-rating/MCC_Rating_Xml_Validazione.xsd?sp&#x3D;r&amp;st&#x3D;2021-05-28T07:53:47Z&amp;se&#x3D;2021-05-28T15:53:47Z&amp;spr&#x3D;https&amp;sv&#x3D;2020-02-10&amp;sr&#x3D;b&amp;sig&#x3D;mZyLWw%2F7QyEeDzbd8i6%2Bnexr4K6CdRFsTl6gXaTPQb0%3D\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Bilancio XSD&lt;/a&gt;
     * @param authorization basic auth token (required)
     * @param body ratingModelXML (optional)
     * @return ApiResponse&lt;RatingOutputModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatingOutputModel> calcoloRatingXMLWithHttpInfo(String authorization, RatingModelXML body) throws ApiException {
        com.squareup.okhttp.Call call = calcoloRatingXMLValidateBeforeCall(authorization, body, null, null);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Calcola il Rating con il file XML (asynchronously)
     * Il servizio permette di rendere fruibili i risultati della procedura di calcolo denominato “Mcc Rating” per la determinazione della probabilità di inadempimento dei soggetti beneficiari finali.  Download: &lt;a href&#x3D;\&quot;https://mccfilehostingprod.blob.core.windows.net/api-rating/MCC_Rating_Xml_Validazione.xsd?sp&#x3D;r&amp;st&#x3D;2021-05-28T07:53:47Z&amp;se&#x3D;2021-05-28T15:53:47Z&amp;spr&#x3D;https&amp;sv&#x3D;2020-02-10&amp;sr&#x3D;b&amp;sig&#x3D;mZyLWw%2F7QyEeDzbd8i6%2Bnexr4K6CdRFsTl6gXaTPQb0%3D\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Bilancio XSD&lt;/a&gt;
     * @param authorization basic auth token (required)
     * @param body ratingModelXML (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call calcoloRatingXMLAsync(String authorization, RatingModelXML body, final ApiCallback<RatingOutputModel> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = calcoloRatingXMLValidateBeforeCall(authorization, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatingOutputModel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}