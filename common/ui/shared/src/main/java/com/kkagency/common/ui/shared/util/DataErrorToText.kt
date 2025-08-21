package com.kkagency.common.ui.shared.util

import com.kkagency.common.domain.util.DataError
import com.kkagency.common.ui.shared.R

fun DataError.toText(): UIText{
    return when(this){
        DataError.Local.DISK_FULL -> UIText.StringResource(R.string.error_disk_full)
        DataError.Local.READ_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Local.WRITE_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.REQUEST_TIMEOUT -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.NO_INTERNET -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.CONNECTION_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.SERIALIZATION_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.UNKNOWN_HOST -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.SSL_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.PAYLOAD_TOO_LARGE -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.BAD_REQUEST -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.UNAUTHORIZED ->UIText.StringResource(R.string.error_disk_full)
        DataError.Network.FORBIDDEN -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.NOT_FOUND -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.METHOD_NOT_ALLOWED ->UIText.StringResource(R.string.error_disk_full)
        DataError.Network.CONFLICT -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.UNSUPPORTED_MEDIA_TYPE -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.TOO_MANY_REQUESTS -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.INTERNAL_SERVER_ERROR -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.BAD_GATEWAY -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.SERVICE_UNAVAILABLE -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.GATEWAY_TIMEOUT -> UIText.StringResource(R.string.error_disk_full)
        DataError.Network.UNKNOWN -> UIText.StringResource(R.string.error_disk_full)
    }
}