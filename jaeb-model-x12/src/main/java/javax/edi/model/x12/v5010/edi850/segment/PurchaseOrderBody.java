package javax.edi.model.x12.v5010.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.X12Body;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PurchaseOrderBody implements X12Body {

	@NotNull
	private Header header;
	
	@NotNull
	private Detail detail;
	
	@NotNull
	private Trailer trailer;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	public Trailer getTrailer() {
		return trailer;
	}
	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}
	
	
}
