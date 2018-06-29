package migration.persistance.domain;

import java.io.Serializable;
import java.util.Date;

public class Sync implements Serializable {

    Date lastSynced;

    Boolean syncInProgress;

    Date syncStartedAt;

    public Date getLastSynced() {
        return lastSynced;
    }

    public void setLastSynced(Date lastSynced) {
        this.lastSynced = lastSynced;
    }

    public Boolean getSyncInProgress() {
        return syncInProgress;
    }

    public void setSyncInProgress(Boolean syncInProgress) {
        this.syncInProgress = syncInProgress;
    }

    public Date getSyncStartedAt() {
        return syncStartedAt;
    }

    public void setSyncStartedAt(Date syncStartedAt) {
        this.syncStartedAt = syncStartedAt;
    }

    @Override
    public String toString() {
        return "Sync{" +
                "lastSynced=" + lastSynced +
                ", syncInProgress=" + syncInProgress +
                ", syncStartedAt=" + syncStartedAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sync)) return false;

        Sync sync = (Sync) o;

        if (getLastSynced() != null ? !getLastSynced().equals(sync.getLastSynced()) : sync.getLastSynced() != null)
            return false;
        if (getSyncInProgress() != null ? !getSyncInProgress().equals(sync.getSyncInProgress()) : sync.getSyncInProgress() != null)
            return false;
        return !(getSyncStartedAt() != null ? !getSyncStartedAt().equals(sync.getSyncStartedAt()) : sync.getSyncStartedAt() != null);

    }

    @Override
    public int hashCode() {
        int result = getLastSynced() != null ? getLastSynced().hashCode() : 0;
        result = 31 * result + (getSyncInProgress() != null ? getSyncInProgress().hashCode() : 0);
        result = 31 * result + (getSyncStartedAt() != null ? getSyncStartedAt().hashCode() : 0);
        return result;
    }
}