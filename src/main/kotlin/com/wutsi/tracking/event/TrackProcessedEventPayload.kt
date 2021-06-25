package com.wutsi.tracking.event

import com.wutsi.tracking.dto.Track

data class TrackProcessedEventPayload(
  val track: Track = Track()
)
