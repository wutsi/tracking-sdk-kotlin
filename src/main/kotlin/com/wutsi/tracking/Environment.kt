package com.wutsi.tracking

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-tracking-test.herokuapp.com"),
  PRODUCTION("https://wutsi-tracking-prod.herokuapp.com"),
  ;
}
