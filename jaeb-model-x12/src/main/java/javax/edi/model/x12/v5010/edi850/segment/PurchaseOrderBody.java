package javax.edi.model.x12.v5010.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.Header;
import javax.edi.model.x12.v5010.X12Body;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PurchaseOrderBody implements X12Body {

	@NotNull
	private OrderBodyHeader orderBodyHeader;
	
	@NotNull
	private Detail detail;
	
	@NotNull
	private Trailer trailer;
        
	public OrderBodyHeader getOrderBodyHeader() {
		return orderBodyHeader;
	}
	public void setOrderBodyHeader(OrderBodyHeader header) {
		this.orderBodyHeader = header;
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
        
        //Getter for interface. Done this way to avoid reflection issue.
        public Header getHeader() {
            return orderBodyHeader;
        }
	
	
}
