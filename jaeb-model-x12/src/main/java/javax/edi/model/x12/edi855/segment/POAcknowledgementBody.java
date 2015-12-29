package javax.edi.model.x12.edi855.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.Header;
import javax.edi.model.x12.X12Body;
import javax.validation.Valid;

@EDISegmentGroup
public class POAcknowledgementBody implements X12Body {

	@Valid
	private AckHeader ackHeader;
	
	@Valid
	private Detail detail;
	
	@Valid
	private Trailer footer;
	
	public AckHeader getAckHeader() {
		return ackHeader;
	}
	public void setAckHeader(AckHeader ackHeader) {
		this.ackHeader = ackHeader;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	public Trailer getFooter() {
		return footer;
	}
	public void setFooter(Trailer footer) {
		this.footer = footer;
	}
        
        //Interface header used to avoid reflection issues
        public Header getHeader() {
		return ackHeader;
	}
}
