/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  net.jpountz.lz4.LZ4BlockInputStream
 *  net.jpountz.lz4.LZ4BlockOutputStream
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class erz {
    private static final Logger g = LogUtils.getLogger();
    private static final Int2ObjectMap<erz> h = new Int2ObjectOpenHashMap();
    private static final Object2ObjectMap<String, erz> i = new Object2ObjectOpenHashMap();
    public static final erz a = erz.a(new erz(1, null, $$0 -> new bfn(new GZIPInputStream((InputStream)$$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream((OutputStream)$$0))));
    public static final erz b = erz.a(new erz(2, "deflate", $$0 -> new bfn(new InflaterInputStream((InputStream)$$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream((OutputStream)$$0))));
    public static final erz c = erz.a(new erz(3, "none", bfn::new, BufferedOutputStream::new));
    public static final erz d = erz.a(new erz(4, "lz4", $$0 -> new bfn((InputStream)new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream((OutputStream)new LZ4BlockOutputStream($$0))));
    public static final erz e = erz.a(new erz(127, null, $$0 -> {
        throw new UnsupportedOperationException();
    }, $$0 -> {
        throw new UnsupportedOperationException();
    }));
    public static final erz f;
    private static volatile erz j;
    private final int k;
    private final @Nullable String l;
    private final a<InputStream> m;
    private final a<OutputStream> n;

    private erz(int $$0, @Nullable String $$1, a<InputStream> $$2, a<OutputStream> $$3) {
        this.k = $$0;
        this.l = $$1;
        this.m = $$2;
        this.n = $$3;
    }

    private static erz a(erz $$0) {
        h.put($$0.k, (Object)$$0);
        if ($$0.l != null) {
            i.put((Object)$$0.l, (Object)$$0);
        }
        return $$0;
    }

    public static @Nullable erz a(int $$0) {
        return (erz)h.get($$0);
    }

    public static void a(String $$0) {
        erz $$1 = (erz)i.get((Object)$$0);
        if ($$1 != null) {
            j = $$1;
        } else {
            g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", (Object)$$0, (Object)String.join((CharSequence)", ", (Iterable<? extends CharSequence>)i.keySet()));
        }
    }

    public static erz a() {
        return j;
    }

    public static boolean b(int $$0) {
        return h.containsKey($$0);
    }

    public int b() {
        return this.k;
    }

    public OutputStream a(OutputStream $$0) throws IOException {
        return this.n.wrap($$0);
    }

    public InputStream a(InputStream $$0) throws IOException {
        return this.m.wrap($$0);
    }

    static {
        j = f = b;
    }

    @FunctionalInterface
    static interface a<O> {
        public O wrap(O var1) throws IOException;
    }
}

