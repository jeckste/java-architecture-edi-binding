package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrgRelationshipsGroupParent {
        
        @NotNull
        @Size(min = 1)
        private HierarchicalLevel level;
        
        @NotNull
        @Size(min = 1)
        @EDICollectionType(OrgRelationshipsIdentificationGroup.class)
        private Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup;
        
        @EDICollectionType(OrgRelationshipsGroupParent.class)
        private Collection<OrgRelationshipsGroupParent> orgRelChild;

        public HierarchicalLevel getLevel() {
                return level;
        }

        public void setLevel(HierarchicalLevel level) {
                this.level = level;
        }

        public Collection<OrgRelationshipsIdentificationGroup> getOrgRelationshipsIdentificationGroup() {
                return orgRelationshipsIdentificationGroup;
        }

        public void setOrgRelationshipsIdentificationGroup(
                        Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup) {
                this.orgRelationshipsIdentificationGroup = orgRelationshipsIdentificationGroup;
        }

    /**
     * @return the orgRelChild
     */
    public Collection<OrgRelationshipsGroupParent> getOrgRelChild() {
        return orgRelChild;
    }

    /**
     * @param orgRelChild the orgRelChild to set
     */
    public void setOrgRelChild(Collection<OrgRelationshipsGroupParent> orgRelChild) {
        this.orgRelChild = orgRelChild;
    }



	
	
}
