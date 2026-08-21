/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface aic
extends xr {
    public static final Logger a = LogUtils.getLogger();

    @Override
    default public void a(aay $$0, Exception $$1) throws v {
        a.error("Failed to handle packet {}, suppressing error", (Object)$$0, (Object)$$1);
    }
}

