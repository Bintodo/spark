/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.sql.streaming

import java.io.Serializable
import java.util.UUID

import org.apache.spark.annotation.Evolving

/**
 * Represents the query info provided to the stateful processor used in the arbitrary state API v2
 * to easily identify task retries on the same partition.
 */
@Evolving
trait QueryInfo extends Serializable {

  /** Returns the streaming query id associated with stateful operator */
  def getQueryId: UUID

  /** Returns the streaming query runId associated with stateful operator */
  def getRunId: UUID

  /** Returns the batch id associated with stateful operator */
  def getBatchId: Long

  /** Returns the string representation of QueryInfo object */
  def toString: String
}
