package javax.edi.model.x12.edi824.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

	@EDISegmentGroup
	public class Header {
		
		@NotNull
		private InterchangeEnvelopeHeader interchangeEnvelopeHeader;

		@NotNull
		private TransactionSetHeader transactionSetHeader;
		
		@NotNull
		private GroupEnvelopeHeader functionalGroupHeader;
		
		@NotNull
		private ApplicationAdviceBeginningSegment appAdviceBeginSegment;
		
		@NotNull
		private Name name;  // Party Ident.
		
		@NotNull
		@Size(max = 12)
		@EDICollectionType(ReferenceNumber.class)
		private Collection<ReferenceNumber> refIdentificationInvalidTxns;

		public InterchangeEnvelopeHeader getInterchangeEnvelopeHeader() {
			return interchangeEnvelopeHeader;
		}

		public void setInterchangeEnvelopeHeader(
				InterchangeEnvelopeHeader interchangeEnvelopeHeader) {
			this.interchangeEnvelopeHeader = interchangeEnvelopeHeader;
		}

		public TransactionSetHeader getTransactionSetHeader() {
			return transactionSetHeader;
		}

		public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
			this.transactionSetHeader = transactionSetHeader;
		}

		public GroupEnvelopeHeader getFunctionalGroupHeader() {
			return functionalGroupHeader;
		}

		public void setFunctionalGroupHeader(GroupEnvelopeHeader functionalGroupHeader) {
			this.functionalGroupHeader = functionalGroupHeader;
		}

		public ApplicationAdviceBeginningSegment getAppAdviceBeginSegment() {
			return appAdviceBeginSegment;
		}

		public void setAppAdviceBeginSegment(
				ApplicationAdviceBeginningSegment appAdviceBeginSegment) {
			this.appAdviceBeginSegment = appAdviceBeginSegment;
		}

		public Name getName() {
			return name;
		}

		public void setName(Name name) {
			this.name = name;
		}

		public Collection<ReferenceNumber> getRefIdentificationInvalidTxn() {
			return refIdentificationInvalidTxns;
		}

		public void setRefIdentificationInvalidTxn(
				Collection<ReferenceNumber> refIdentificationInvalidTxns) {
			this.refIdentificationInvalidTxns = refIdentificationInvalidTxns;
		}
}
