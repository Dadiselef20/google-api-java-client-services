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

package com.google.api.services.billingbudgets.v1.model;

/**
 * A budget is a plan that describes what you expect to spend on Cloud projects, plus the rules to
 * execute as spend is tracked against that plan, (for example, send an alert when 90% of the target
 * spend is met). The budget time period is configurable, with options such as month (default),
 * quarter, year, or custom time period.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1Budget extends com.google.api.client.json.GenericJson {

  /**
   * Required. Budgeted amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBudgetsV1BudgetAmount amount;

  /**
   * Optional. Filters that define which resources are used to compute the actual spend against the
   * budget amount, such as projects, services, and the budget's time period, as well as other
   * filters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBudgetsV1Filter budgetFilter;

  /**
   * User data for display name in UI. The name must be less than or equal to 60 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An
   * empty etag causes an update to overwrite other changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. Resource name of the budget. The resource name implies the scope of a budget.
   * Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBillingBudgetsV1NotificationsRule notificationsRule;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownershipScope;

  /**
   * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend
   * exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications.
   * Required if using email notifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBillingBudgetsV1ThresholdRule> thresholdRules;

  /**
   * Required. Budgeted amount.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1BudgetAmount getAmount() {
    return amount;
  }

  /**
   * Required. Budgeted amount.
   * @param amount amount or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setAmount(GoogleCloudBillingBudgetsV1BudgetAmount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Optional. Filters that define which resources are used to compute the actual spend against the
   * budget amount, such as projects, services, and the budget's time period, as well as other
   * filters.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Filter getBudgetFilter() {
    return budgetFilter;
  }

  /**
   * Optional. Filters that define which resources are used to compute the actual spend against the
   * budget amount, such as projects, services, and the budget's time period, as well as other
   * filters.
   * @param budgetFilter budgetFilter or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setBudgetFilter(GoogleCloudBillingBudgetsV1Filter budgetFilter) {
    this.budgetFilter = budgetFilter;
    return this;
  }

  /**
   * User data for display name in UI. The name must be less than or equal to 60 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User data for display name in UI. The name must be less than or equal to 60 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An
   * empty etag causes an update to overwrite other changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An
   * empty etag causes an update to overwrite other changes.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. Resource name of the budget. The resource name implies the scope of a budget.
   * Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the budget. The resource name implies the scope of a budget.
   * Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
   * @return value or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1NotificationsRule getNotificationsRule() {
    return notificationsRule;
  }

  /**
   * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
   * @param notificationsRule notificationsRule or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setNotificationsRule(GoogleCloudBillingBudgetsV1NotificationsRule notificationsRule) {
    this.notificationsRule = notificationsRule;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnershipScope() {
    return ownershipScope;
  }

  /**
   * @param ownershipScope ownershipScope or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setOwnershipScope(java.lang.String ownershipScope) {
    this.ownershipScope = ownershipScope;
    return this;
  }

  /**
   * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend
   * exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications.
   * Required if using email notifications.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBillingBudgetsV1ThresholdRule> getThresholdRules() {
    return thresholdRules;
  }

  /**
   * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend
   * exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications.
   * Required if using email notifications.
   * @param thresholdRules thresholdRules or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1Budget setThresholdRules(java.util.List<GoogleCloudBillingBudgetsV1ThresholdRule> thresholdRules) {
    this.thresholdRules = thresholdRules;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1Budget set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1Budget) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1Budget clone() {
    return (GoogleCloudBillingBudgetsV1Budget) super.clone();
  }

}
