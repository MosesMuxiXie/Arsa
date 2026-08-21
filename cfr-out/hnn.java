/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class hnn
implements caz {
    private final hoh a;
    private final Set<cax> b = new ObjectOpenHashSet();
    private final cbf c = new cbf();

    public hnn(LongSupplier $$0, hoh $$1) {
        this.a = $$1;
        this.b.add(cbg.a($$0));
        this.a();
    }

    private void a() {
        this.b.addAll(cbg.a());
        this.b.add(cax.a("totalChunks", caw.f, this.a, hoh::g));
        this.b.add(cax.a("renderedChunks", caw.f, this.a, hoh::i));
        this.b.add(cax.a("lastViewDistance", caw.f, this.a, hoh::h));
        hts $$0 = this.a.f();
        if ($$0 != null) {
            this.b.add(cax.a("toUpload", caw.g, $$0, hts::g));
            this.b.add(cax.a("freeBufferCount", caw.g, $$0, hts::h));
            this.b.add(cax.a("compileQueueSize", caw.g, $$0, hts::f));
        }
        this.b.add(cax.a("gpuUtilization", caw.i, gfj.V(), gfj::z));
    }

    @Override
    public Set<cax> a(Supplier<bzj> $$0) {
        this.b.addAll(this.c.a($$0));
        return this.b;
    }
}

