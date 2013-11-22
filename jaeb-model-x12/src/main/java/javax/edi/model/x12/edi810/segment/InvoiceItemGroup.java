package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalItemData;
import javax.edi.model.x12.segment.AllowanceChargeOrService;
import javax.edi.model.x12.segment.BaselineItemData;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.NoteSpecialInstructions;
import javax.edi.model.x12.segment.PricingInformation;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TermsOfSale;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class InvoiceItemGroup {

	@NotNull
	private BaselineItemData baselineItemData;
	
	@EDICollectionType(NoteSpecialInstructions.class)
	@Size(min=0, max=100)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;
        
        private ProductItemDescription productItemDescription;
        
        private TermsOfSale termsOfSale;
	
	@EDICollectionType(AdditionalItemData.class)
	@Size(min=0, max=5)
	private Collection<AdditionalItemData> additionalItemData;
	
	@EDICollectionType(PricingInformation.class)
	@Size(min=0, max=25)
	private Collection<PricingInformation> pricingInformation;	
	
	@EDICollectionType(Name.class)
	@Size(min=0, max=200)
	private Collection<Name> name;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(min=0, max=200)
	private Collection<ReferenceNumber> referenceNumbers;
        
        @EDICollectionType(DateTimeReference.class)
        @Size(min=0, max=10)
        private Collection<DateTimeReference> dateTimeReferences;
        
        private AllowanceChargeOrService allowanceChargeOrService;

	public BaselineItemData getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(BaselineItemData baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public Collection<NoteSpecialInstructions> getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}

	public void setNoteSpecialInstructions(
			Collection<NoteSpecialInstructions> noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}

	public Collection<AdditionalItemData> getAdditionalItemData() {
		return additionalItemData;
	}

	public void setAdditionalItemData(
			Collection<AdditionalItemData> additionalItemData) {
		this.additionalItemData = additionalItemData;
	}

	public Collection<PricingInformation> getPricingInformation() {
		return pricingInformation;
	}

	public void setPricingInformation(
			Collection<PricingInformation> pricingInformation) {
		this.pricingInformation = pricingInformation;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

    /**
     * @return the productItemDescription
     */
    public ProductItemDescription getProductItemDescription() {
        return productItemDescription;
    }

    /**
     * @param productItemDescription the productItemDescription to set
     */
    public void setProductItemDescription(ProductItemDescription productItemDescription) {
        this.productItemDescription = productItemDescription;
    }

    /**
     * @return the termsOfSale
     */
    public TermsOfSale getTermsOfSale() {
        return termsOfSale;
    }

    /**
     * @param termsOfSale the termsOfSale to set
     */
    public void setTermsOfSale(TermsOfSale termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    /**
     * @return the dateTimeReferences
     */
    public Collection<DateTimeReference> getDateTimeReferences() {
        return dateTimeReferences;
    }

    /**
     * @param dateTimeReferences the dateTimeReferences to set
     */
    public void setDateTimeReferences(Collection<DateTimeReference> dateTimeReferences) {
        this.dateTimeReferences = dateTimeReferences;
    }

    /**
     * @return the allowanceChargeOrService
     */
    public AllowanceChargeOrService getAllowanceChargeOrService() {
        return allowanceChargeOrService;
    }

    /**
     * @param allowanceChargeOrService the allowanceChargeOrService to set
     */
    public void setAllowanceChargeOrService(AllowanceChargeOrService allowanceChargeOrService) {
        this.allowanceChargeOrService = allowanceChargeOrService;
    }
	
	

}
