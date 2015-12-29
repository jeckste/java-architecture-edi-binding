package javax.edi.model.x12.v5010.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.ReferenceNumber;
import javax.edi.model.x12.v5010.segment.TransactionSetHeader;
import javax.edi.model.x12.v5010.segment.AllowanceChargeOrService;
import javax.edi.model.x12.v5010.segment.Currency;
import javax.edi.model.x12.v5010.segment.DateTimeReference;
import javax.edi.model.x12.v5010.segment.FOBRelatedInstruction;
import javax.edi.model.x12.v5010.segment.PersonContact;
import javax.edi.model.x12.v5010.segment.ProductItemDescription;
import javax.edi.model.x12.v5010.segment.RoutingCarrierDetails;
import javax.edi.model.x12.v5010.segment.TermsOfSale;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrderBodyHeader implements javax.edi.model.x12.v5010.Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private PurchaseOrderBeginningSegment beginningSegment;
	
	private Currency currency;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(max=12)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@EDICollectionType(PersonContact.class)
	@Size(max=3)
	private Collection<PersonContact> personContacts;
	
	private FOBRelatedInstruction fobRelatedInstruction;
	
	@EDICollectionType(AllowanceChargeOrService.class)
	@Size(max=25)
	private Collection<AllowanceChargeOrService> allowanceChargeOrService;
	
	private TermsOfSale termsOfSale;
	
	@EDICollectionType(DateTimeReference.class)
	@Size(max=25)
	private Collection<DateTimeReference> dateTimeReference;
	
	private ProductItemDescription productItemDescription;
	
	private RoutingCarrierDetails routeCarrierDetails;

	@Size(max=1000)
	@EDICollectionType(ReferenceIdentificationGroup.class)
	private Collection<ReferenceIdentificationGroup> referenceIdentifications;

	@Size(max=200)
	@EDICollectionType(ShippingBillingGroup.class)
	private Collection<ShippingBillingGroup> shippingBillingGroups;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public PurchaseOrderBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(PurchaseOrderBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public Collection<PersonContact> getPersonContacts() {
		return personContacts;
	}

	public void setPersonContacts(Collection<PersonContact> personContacts) {
		this.personContacts = personContacts;
	}

	public FOBRelatedInstruction getFobRelatedInstruction() {
		return fobRelatedInstruction;
	}

	public void setFobRelatedInstruction(FOBRelatedInstruction fobRelatedInstruction) {
		this.fobRelatedInstruction = fobRelatedInstruction;
	}

	public TermsOfSale getTermsOfSale() {
		return termsOfSale;
	}

	public void setTermsOfSale(TermsOfSale termsOfSale) {
		this.termsOfSale = termsOfSale;
	}

	public Collection<DateTimeReference> getDateTimeReference() {
		return dateTimeReference;
	}

	public void setDateTimeReference(Collection<DateTimeReference> dateTimeReference) {
		this.dateTimeReference = dateTimeReference;
	}

	public Collection<ReferenceIdentificationGroup> getReferenceIdentifications() {
		return referenceIdentifications;
	}

	public void setReferenceIdentifications(
			Collection<ReferenceIdentificationGroup> referenceIdentifications) {
		this.referenceIdentifications = referenceIdentifications;
	}

	public Collection<ShippingBillingGroup> getShippingBillingGroups() {
		return shippingBillingGroups;
	}

	public void setShippingBillingGroups(
			Collection<ShippingBillingGroup> shippingBillingGroups) {
		this.shippingBillingGroups = shippingBillingGroups;
	}



	public Collection<AllowanceChargeOrService> getAllowanceChargeOrService() {
		return allowanceChargeOrService;
	}

	public void setAllowanceChargeOrService(
			Collection<AllowanceChargeOrService> allowanceChargeOrService) {
		this.allowanceChargeOrService = allowanceChargeOrService;
	}

	public RoutingCarrierDetails getRouteCarrierDetails() {
		return routeCarrierDetails;
	}

	public void setRouteCarrierDetails(RoutingCarrierDetails routeCarrierDetails) {
		this.routeCarrierDetails = routeCarrierDetails;
	}

	public ProductItemDescription getProductItemDescription() {
		return productItemDescription;
	}

	public void setProductItemDescription(ProductItemDescription productItemDescription) {
		this.productItemDescription = productItemDescription;
	}
	

}
