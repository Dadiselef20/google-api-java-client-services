/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * Content part.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1Part extends com.google.api.client.json.GenericJson {

  /**
   * Optional. URI based data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1FileData fileData;

  /**
   * Optional. A predicted [FunctionCall] returned from the model that contains a string
   * representing the [FunctionDeclaration.name] with the parameters and their values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1FunctionCall functionCall;

  /**
   * Optional. The result output of a [FunctionCall] that contains a string representing the
   * [FunctionDeclaration.name] and a structured JSON object containing any output from the function
   * call. It is used as context to the model.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1FunctionResponse functionResponse;

  /**
   * Optional. Inlined bytes data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1Blob inlineData;

  /**
   * Optional. Text part (can be code).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Optional. Video metadata. The metadata should only be specified while the video data is
   * presented in inline_data or file_data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1VideoMetadata videoMetadata;

  /**
   * Optional. URI based data.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1FileData getFileData() {
    return fileData;
  }

  /**
   * Optional. URI based data.
   * @param fileData fileData or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setFileData(GoogleCloudAiplatformV1beta1FileData fileData) {
    this.fileData = fileData;
    return this;
  }

  /**
   * Optional. A predicted [FunctionCall] returned from the model that contains a string
   * representing the [FunctionDeclaration.name] with the parameters and their values.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1FunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Optional. A predicted [FunctionCall] returned from the model that contains a string
   * representing the [FunctionDeclaration.name] with the parameters and their values.
   * @param functionCall functionCall or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setFunctionCall(GoogleCloudAiplatformV1beta1FunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Optional. The result output of a [FunctionCall] that contains a string representing the
   * [FunctionDeclaration.name] and a structured JSON object containing any output from the function
   * call. It is used as context to the model.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1FunctionResponse getFunctionResponse() {
    return functionResponse;
  }

  /**
   * Optional. The result output of a [FunctionCall] that contains a string representing the
   * [FunctionDeclaration.name] and a structured JSON object containing any output from the function
   * call. It is used as context to the model.
   * @param functionResponse functionResponse or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setFunctionResponse(GoogleCloudAiplatformV1beta1FunctionResponse functionResponse) {
    this.functionResponse = functionResponse;
    return this;
  }

  /**
   * Optional. Inlined bytes data.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Blob getInlineData() {
    return inlineData;
  }

  /**
   * Optional. Inlined bytes data.
   * @param inlineData inlineData or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setInlineData(GoogleCloudAiplatformV1beta1Blob inlineData) {
    this.inlineData = inlineData;
    return this;
  }

  /**
   * Optional. Text part (can be code).
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Optional. Text part (can be code).
   * @param text text or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Optional. Video metadata. The metadata should only be specified while the video data is
   * presented in inline_data or file_data.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1VideoMetadata getVideoMetadata() {
    return videoMetadata;
  }

  /**
   * Optional. Video metadata. The metadata should only be specified while the video data is
   * presented in inline_data or file_data.
   * @param videoMetadata videoMetadata or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1Part setVideoMetadata(GoogleCloudAiplatformV1beta1VideoMetadata videoMetadata) {
    this.videoMetadata = videoMetadata;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1Part set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1Part) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1Part clone() {
    return (GoogleCloudAiplatformV1beta1Part) super.clone();
  }

}
