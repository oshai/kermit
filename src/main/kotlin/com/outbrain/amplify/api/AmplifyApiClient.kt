package com.outbrain.amplify.api

import com.outbrain.amplify.api.data.Marketer
import com.outbrain.amplify.api.helpers.Connector


class AmplifyApiClient(token: String) {
    private val connector = Connector(token)
    open class ApiBase(protected val path: String)

    fun marketers(): Marketers {
        return Marketers()
    }






    inner class Marketers(): ApiBase("/marketers") {
        fun id(id: String): MarketerId {
            return MarketerId(path, id)
        }
    }

    inner class MarketerId(parentPath: String, id: String): ApiBase("$parentPath/$id") {
        fun get(): Marketer {
            return connector.get(path)
        }

    }

}

