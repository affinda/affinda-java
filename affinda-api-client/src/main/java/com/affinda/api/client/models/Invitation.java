package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/** The Invitation model. */
@Fluent
public final class Invitation {
    /*
     * Uniquely identify an invitation.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private Organization organization;

    /*
     * The email which the invitation is sent to.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The role property.
     */
    @JsonProperty(value = "role")
    private OrganizationRole role;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private InvitationStatus status;

    /*
     * The date after which the invitation expires. Default is 10 days from
     * now.
     */
    @JsonProperty(value = "expiryDate")
    private LocalDate expiryDate;

    /*
     * The invitedBy property.
     */
    @JsonProperty(value = "invitedBy")
    private User invitedBy;

    /*
     * The respondedBy property.
     */
    @JsonProperty(value = "respondedBy")
    private InvitationRespondedBy respondedBy;

    /*
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

    /**
     * Get the identifier property: Uniquely identify an invitation.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify an invitation.
     *
     * @param identifier the identifier value to set.
     * @return the Invitation object itself.
     */
    public Invitation setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the organization property: The organization property.
     *
     * @return the organization value.
     */
    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization property.
     *
     * @param organization the organization value to set.
     * @return the Invitation object itself.
     */
    public Invitation setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the email property: The email which the invitation is sent to.
     *
     * @return the email value.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email property: The email which the invitation is sent to.
     *
     * @param email the email value to set.
     * @return the Invitation object itself.
     */
    public Invitation setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the role property: The role property.
     *
     * @return the role value.
     */
    public OrganizationRole getRole() {
        return this.role;
    }

    /**
     * Set the role property: The role property.
     *
     * @param role the role value to set.
     * @return the Invitation object itself.
     */
    public Invitation setRole(OrganizationRole role) {
        this.role = role;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public InvitationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the Invitation object itself.
     */
    public Invitation setStatus(InvitationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the expiryDate property: The date after which the invitation expires. Default is 10 days from now.
     *
     * @return the expiryDate value.
     */
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }

    /**
     * Set the expiryDate property: The date after which the invitation expires. Default is 10 days from now.
     *
     * @param expiryDate the expiryDate value to set.
     * @return the Invitation object itself.
     */
    public Invitation setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get the invitedBy property: The invitedBy property.
     *
     * @return the invitedBy value.
     */
    public User getInvitedBy() {
        return this.invitedBy;
    }

    /**
     * Set the invitedBy property: The invitedBy property.
     *
     * @param invitedBy the invitedBy value to set.
     * @return the Invitation object itself.
     */
    public Invitation setInvitedBy(User invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    /**
     * Get the respondedBy property: The respondedBy property.
     *
     * @return the respondedBy value.
     */
    public InvitationRespondedBy getRespondedBy() {
        return this.respondedBy;
    }

    /**
     * Set the respondedBy property: The respondedBy property.
     *
     * @param respondedBy the respondedBy value to set.
     * @return the Invitation object itself.
     */
    public Invitation setRespondedBy(InvitationRespondedBy respondedBy) {
        this.respondedBy = respondedBy;
        return this;
    }

    /**
     * Get the createdDt property: The createdDt property.
     *
     * @return the createdDt value.
     */
    public OffsetDateTime getCreatedDt() {
        return this.createdDt;
    }

    /**
     * Set the createdDt property: The createdDt property.
     *
     * @param createdDt the createdDt value to set.
     * @return the Invitation object itself.
     */
    public Invitation setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }
}
