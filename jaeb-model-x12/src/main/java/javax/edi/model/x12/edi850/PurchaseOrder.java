package javax.edi.model.x12.edi850;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi850.segment.PurchaseOrderBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelopeHeader envelopeHeader;
	
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	private PurchaseOrderBody body;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	
	@NotNull
	private InterchangeEnvelopeTrailer envelopeTrailer;

	public InterchangeEnvelopeHeader getEnvelopeHeader() {
		return envelopeHeader;
	}

	public void setEnvelopeHeader(InterchangeEnvelopeHeader envelopeHeader) {
		this.envelopeHeader = envelopeHeader;
	}

	public GroupEnvelopeHeader getGroupEnvelopeHeader() {
		return groupEnvelopeHeader;
	}

	public void setGroupEnvelopeHeader(GroupEnvelopeHeader groupEnvelopeHeader) {
		this.groupEnvelopeHeader = groupEnvelopeHeader;
	}

	public PurchaseOrderBody getBody() {
		return body;
	}

	public void setBody(PurchaseOrderBody body) {
		this.body = body;
	}

	public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
		return groupEnvelopeTrailer;
	}

	public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
		this.groupEnvelopeTrailer = groupEnvelopeTrailer;
	}

	public InterchangeEnvelopeTrailer getEnvelopeTrailer() {
		return envelopeTrailer;
	}

	public void setEnvelopeTrailer(InterchangeEnvelopeTrailer envelopeTrailer) {
		this.envelopeTrailer = envelopeTrailer;
	}
}
