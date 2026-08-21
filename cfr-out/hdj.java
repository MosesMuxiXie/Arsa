/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import java.util.Set;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class hdj {
    private final @Nullable String a;
    private final Vector3fc b;
    private final Vector3fc c;
    private final hdk d;
    private final boolean e;
    private final hdr f;
    private final hdr g;
    private final Set<iz> h;

    protected hdj(@Nullable String $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, hdk $$9, boolean $$10, float $$11, float $$12, Set<iz> $$13) {
        this.a = $$0;
        this.f = new hdr($$1, $$2);
        this.b = new Vector3f($$3, $$4, $$5);
        this.c = new Vector3f($$6, $$7, $$8);
        this.d = $$9;
        this.e = $$10;
        this.g = new hdr($$11, $$12);
        this.h = $$13;
    }

    public hdg.a a(int $$0, int $$1) {
        return new hdg.a((int)this.f.a(), (int)this.f.b(), this.b.x(), this.b.y(), this.b.z(), this.c.x(), this.c.y(), this.c.z(), this.d.b, this.d.c, this.d.d, this.e, (float)$$0 * this.g.a(), (float)$$1 * this.g.b(), this.h);
    }
}

