package com.microsoft.azure.documentdb.sample.dao;

import com.microsoft.azure.documentdb.ConnectionPolicy;
import com.microsoft.azure.documentdb.ConsistencyLevel;
import com.microsoft.azure.documentdb.DocumentClient;

public class DocumentClientFactory {
    private static final String HOST = "https://benlamdemo1.documents.azure.com:443/";
    private static final String MASTER_KEY = "KVeCzyO8egV5hRI3iSGEHT1xJReiaNwmOl9W9bOMGEdaWBrmT75AVqweUUxRfU2TTzwIZlD7oDtYsKDDqntDpQ==";

    private static DocumentClient documentClient;

    public static DocumentClient getDocumentClient() {
        if (documentClient == null) {
            documentClient = new DocumentClient(HOST, MASTER_KEY,
                    ConnectionPolicy.GetDefault(), ConsistencyLevel.Session);
        }

        return documentClient;
    }

}
