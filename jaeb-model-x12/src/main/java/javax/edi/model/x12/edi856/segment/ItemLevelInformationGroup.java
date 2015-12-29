package javax.edi.model.x12.edi856.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ShipmentItemDetail;
import javax.edi.model.x12.segment.TransactionSetTotals;

@EDISegmentGroup
public class ItemLevelInformationGroup {

	private HierarchicalLevel itemLevel;
	private ItemIdentification itemIdentification;
	private ShipmentItemDetail shipmentItemDetail;
	private ProductItemDescription productItemDescription;
        // Not correct placement, but it is a workaround since the parser is 
        // breaking if this field is optional and on the footer.
        private TransactionSetTotals transactionSetTotals;
	
	public HierarchicalLevel getItemLevel() {
		return itemLevel;
	}
	
	public void setItemLevel(HierarchicalLevel itemLevel) {
		this.itemLevel = itemLevel;
	}
	
	public ItemIdentification getItemIdentification() {
		return itemIdentification;
	}
	public void setItemIdentification(ItemIdentification itemIdentification) {
		this.itemIdentification = itemIdentification;
	}
	public ShipmentItemDetail getShipmentItemDetail() {
		return shipmentItemDetail;
	}
	public void setShipmentItemDetail(ShipmentItemDetail shipmentItemDetail) {
		this.shipmentItemDetail = shipmentItemDetail;
	}

	public ProductItemDescription getProductItemDescription() {
		return productItemDescription;
	}

	public void setProductItemDescription(ProductItemDescription productItemDescription) {
		this.productItemDescription = productItemDescription;
	}

    /**
     * @return the transactionSetTotals
     */
    public TransactionSetTotals getTransactionSetTotals() {
        return transactionSetTotals;
    }

    /**
     * @param transactionSetTotals the transactionSetTotals to set
     */
    public void setTransactionSetTotals(TransactionSetTotals transactionSetTotals) {
        this.transactionSetTotals = transactionSetTotals;
    }
	
	
}
