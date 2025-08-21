package com.kkagency.common.domain.util

sealed interface DataError : Error {

    enum class Network : DataError {
        // Client-Side
        REQUEST_TIMEOUT,
        NO_INTERNET,
        CONNECTION_ERROR,
        SERIALIZATION_ERROR,
        UNKNOWN_HOST,
        SSL_ERROR,
        PAYLOAD_TOO_LARGE,

        // HTTP Status Code Errors (Client Errors 4xx)
        BAD_REQUEST,          // 400
        UNAUTHORIZED,         // 401
        FORBIDDEN,            // 403
        NOT_FOUND,            // 404
        METHOD_NOT_ALLOWED,   // 405
        CONFLICT,             // 409
        UNSUPPORTED_MEDIA_TYPE, // 415
        TOO_MANY_REQUESTS,    // 429

        // Server Errors 5xx
        INTERNAL_SERVER_ERROR,// 500
        BAD_GATEWAY,          // 502
        SERVICE_UNAVAILABLE,  // 503
        GATEWAY_TIMEOUT,      // 504

        UNKNOWN
    }

    enum class Local : DataError {
        DISK_FULL,
        READ_ERROR,
        WRITE_ERROR
    }
}