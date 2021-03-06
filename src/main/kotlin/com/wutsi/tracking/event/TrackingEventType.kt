package com.wutsi.tracking.event

enum class TrackingEventType(val urn: String) {
  TRACK_SUBMITTED("urn:event:wutsi:tracking:track-submitted"),
  TRACK_PROCESSED("urn:event:wutsi:tracking:track-processed")
}
