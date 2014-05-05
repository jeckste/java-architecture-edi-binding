package javax.edi.model.x12.edi855.segment;

import java.util.Collection;
import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.LineItemAcknowledgement;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class AcknowledgementBodyHeader implements javax.edi.model.x12.Header {

	@NotNull
	@Valid
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	@Valid
	private POAcknowledgementBeginningSegment beginningSegment;
        
        @EDICollectionType(ReferenceIdentification.class)
        private Collection<ReferenceIdentification> referenceIdentification;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public POAcknowledgementBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			POAcknowledgementBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

    /**
     * @return the referenceIdentification
     */
    public Collection<ReferenceIdentification> getReferenceIdentification() {
        return referenceIdentification;
    }

    /**
     * @param referenceIdentification the referenceIdentification to set
     */
    public void setReferenceIdentification(Collection<ReferenceIdentification> referenceIdentification) {
        this.referenceIdentification = referenceIdentification;
    }
	
	
}
