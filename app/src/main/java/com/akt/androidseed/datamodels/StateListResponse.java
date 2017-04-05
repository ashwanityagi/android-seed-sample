package com.akt.androidseed.datamodels;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class StateListResponse {

    @SerializedName("RestResponse")
    private RestResponse restResponse;

    /**
     * @return The restResponse
     */
    public RestResponse getRestResponse() {
        return restResponse;
    }

    /**
     * @param restResponse The RestResponse
     */
    public void setRestResponse(RestResponse restResponse) {
        this.restResponse = restResponse;
    }


    public class RestResponse {

        @SerializedName("messages")
        private List<String> messages = null;
        @SerializedName("result")
        private ArrayList<com.akt.androidseed.datamodels.StateResult> result = null;

        /**
         * @return The messages
         */
        public List<String> getMessages() {
            return messages;
        }

        /**
         * @param messages The messages
         */
        public void setMessages(List<String> messages) {
            this.messages = messages;
        }

        /**
         * @return The result
         */
        public ArrayList<com.akt.androidseed.datamodels.StateResult> getResult() {
            return result;
        }

        /**
         * @param result The result
         */
        public void setResult(ArrayList<com.akt.androidseed.datamodels.StateResult> result) {
            this.result = result;
        }


    }
}

