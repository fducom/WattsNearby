package re.sourcecode.android.wattsnearby.sync;

/**
 * Created by olem on 4/19/17.
 */

public interface OCMSyncTaskListener<T> {
    public void onOCMSyncSuccess(T object);
    public void onOCMSyncFailure(Exception exception);
}
