/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public final class fyb
extends Enum<fyb> {
    public static final /* enum */ fyb a = new fyb("icons");
    public static final /* enum */ fyb b = new fyb("icons", "snapshot");
    private final String[] c;
    private static final /* synthetic */ fyb[] d;

    public static fyb[] values() {
        return (fyb[])d.clone();
    }

    public static fyb valueOf(String $$0) {
        return Enum.valueOf(fyb.class, $$0);
    }

    private fyb(String ... $$0) {
        this.c = $$0;
    }

    public List<bar<InputStream>> a(azl $$0) throws IOException {
        return List.of(this.a($$0, "icon_16x16.png"), this.a($$0, "icon_32x32.png"), this.a($$0, "icon_48x48.png"), this.a($$0, "icon_128x128.png"), this.a($$0, "icon_256x256.png"));
    }

    public bar<InputStream> b(azl $$0) throws IOException {
        return this.a($$0, "minecraft.icns");
    }

    private bar<InputStream> a(azl $$0, String $$1) throws IOException {
        CharSequence[] $$2 = (String[])ArrayUtils.add((Object[])this.c, (Object)$$1);
        bar<InputStream> $$3 = $$0.a((String[])$$2);
        if ($$3 == null) {
            throw new FileNotFoundException(String.join((CharSequence)"/", $$2));
        }
        return $$3;
    }

    private static /* synthetic */ fyb[] a() {
        return new fyb[]{a, b};
    }

    static {
        d = fyb.a();
    }
}

