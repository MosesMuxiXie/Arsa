/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;

public final class ery
implements AutoCloseable {
    public static final String a = ".mca";
    private static final int b = 256;
    private final Long2ObjectLinkedOpenHashMap<erx> c = new Long2ObjectLinkedOpenHashMap();
    private final esa d;
    private final Path e;
    private final boolean f;

    ery(esa $$0, Path $$1, boolean $$2) {
        this.e = $$1;
        this.f = $$2;
        this.d = $$0;
    }

    private erx b(dvu $$0) throws IOException {
        long $$1 = dvu.d($$0.i(), $$0.j());
        erx $$2 = (erx)this.c.getAndMoveToFirst($$1);
        if ($$2 != null) {
            return $$2;
        }
        if (this.c.size() >= 256) {
            ((erx)this.c.removeLast()).close();
        }
        bfp.c(this.e);
        Path $$3 = this.e.resolve("r." + $$0.i() + "." + $$0.j() + a);
        erx $$4 = new erx(this.d, $$3, this.e, this.f);
        this.c.putAndMoveToFirst($$1, (Object)$$4);
        return $$4;
    }

    public @Nullable uz a(dvu $$0) throws IOException {
        erx $$1 = this.b($$0);
        try (DataInputStream $$2 = $$1.a($$0);){
            if ($$2 == null) {
                uz uz2 = null;
                return uz2;
            }
            uz uz3 = vm.a($$2);
            return uz3;
        }
    }

    public void a(dvu $$0, vw $$1) throws IOException {
        erx $$2 = this.b($$0);
        try (DataInputStream $$3 = $$2.a($$0);){
            if ($$3 != null) {
                vm.a((DataInput)$$3, $$1, vi.c());
            }
        }
    }

    protected void a(dvu $$0, @Nullable uz $$1) throws IOException {
        if (w.X) {
            return;
        }
        erx $$2 = this.b($$0);
        if ($$1 == null) {
            $$2.d($$0);
        } else {
            try (DataOutputStream $$3 = $$2.c($$0);){
                vm.a($$1, (DataOutput)$$3);
            }
        }
    }

    @Override
    public void close() throws IOException {
        bfl<IOException> $$0 = new bfl<IOException>();
        for (erx $$1 : this.c.values()) {
            try {
                $$1.close();
            }
            catch (IOException $$2) {
                $$0.a($$2);
            }
        }
        $$0.a();
    }

    public void a() throws IOException {
        for (erx $$0 : this.c.values()) {
            $$0.b();
        }
    }

    public esa b() {
        return this.d;
    }
}

