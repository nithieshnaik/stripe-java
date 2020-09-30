// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.SetupAttemptListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SetupAttempt extends ApiResource implements HasId {
  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-application">application</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-customer">customer</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code setup_attempt}.
   */
  @SerializedName("object")
  String object;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-on_behalf_of">on_behalf_of</a>
   * on the SetupIntent at the time of this confirmation.
   */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /** ID of the payment method used with this SetupAttempt. */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  @SerializedName("payment_method_details")
  PaymentMethodDetails paymentMethodDetails;

  /** The error encountered during this attempt to confirm the SetupIntent, if any. */
  @SerializedName("setup_error")
  StripeError setupError;

  /** ID of the SetupIntent that this attempt belongs to. */
  @SerializedName("setup_intent")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupIntent> setupIntent;

  /**
   * Status of this SetupAttempt, one of {@code requires_confirmation}, {@code requires_action},
   * {@code processing}, {@code succeeded}, {@code failed}, or {@code abandoned}.
   */
  @SerializedName("status")
  String status;

  /**
   * The value of <a
   * href="https://stripe.com/docs/api/setup_intents/object#setup_intent_object-usage">usage</a> on
   * the SetupIntent at the time of this confirmation, one of {@code off_session} or {@code
   * on_session}.
   */
  @SerializedName("usage")
  String usage;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentMethod} object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded {@code paymentMethod}. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code setupIntent} object. */
  public String getSetupIntent() {
    return (this.setupIntent != null) ? this.setupIntent.getId() : null;
  }

  public void setSetupIntent(String id) {
    this.setupIntent = ApiResource.setExpandableFieldId(id, this.setupIntent);
  }

  /** Get expanded {@code setupIntent}. */
  public SetupIntent getSetupIntentObject() {
    return (this.setupIntent != null) ? this.setupIntent.getExpanded() : null;
  }

  public void setSetupIntentObject(SetupIntent expandableObject) {
    this.setupIntent = new ExpandableField<SetupIntent>(expandableObject.getId(), expandableObject);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_attempts");
    return ApiResource.requestCollection(url, params, SetupAttemptCollection.class, options);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupAttempts associated with a provided SetupIntent. */
  public static SetupAttemptCollection list(SetupAttemptListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/setup_attempts");
    return ApiResource.requestCollection(url, params, SetupAttemptCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodDetails extends StripeObject {
    @SerializedName("card")
    Card card;

    /**
     * The type of the payment method used in the SetupIntent (e.g., {@code card}). An additional
     * hash is included on {@code payment_method_details} with a name matching this value. It
     * contains confirmation-specific information for the payment method.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** Populated if this authorization used 3D Secure authentication. */
      @SerializedName("three_d_secure")
      Charge.PaymentMethodDetails.Card.ThreeDSecure threeDSecure;
    }
  }
}
