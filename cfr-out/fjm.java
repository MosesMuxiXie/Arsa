/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class fjm {
    private eev a = eev.a;
    private egm b = egm.a;
    private is c = is.c;
    private boolean d;
    private @Nullable ffg e;
    private fja f = fja.b;
    private @Nullable bgr g;
    private int h;
    private final List<fjn> i = Lists.newArrayList();
    private boolean j;
    private boolean k;

    public fjm a() {
        fjm $$0 = new fjm();
        $$0.a = this.a;
        $$0.b = this.b;
        $$0.c = this.c;
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        $$0.g = this.g;
        $$0.h = this.h;
        $$0.i.addAll(this.i);
        $$0.j = this.j;
        $$0.k = this.k;
        return $$0;
    }

    public fjm a(eev $$0) {
        this.a = $$0;
        return this;
    }

    public fjm a(egm $$0) {
        this.b = $$0;
        return this;
    }

    public fjm a(is $$0) {
        this.c = $$0;
        return this;
    }

    public fjm a(boolean $$0) {
        this.d = $$0;
        return this;
    }

    public fjm a(ffg $$0) {
        this.e = $$0;
        return this;
    }

    public fjm a(@Nullable bgr $$0) {
        this.g = $$0;
        return this;
    }

    public fjm a(fja $$0) {
        this.f = $$0;
        return this;
    }

    public fjm b(boolean $$0) {
        this.j = $$0;
        return this;
    }

    public fjm b() {
        this.i.clear();
        return this;
    }

    public fjm a(fjn $$0) {
        this.i.add($$0);
        return this;
    }

    public fjm b(fjn $$0) {
        this.i.remove($$0);
        return this;
    }

    public eev c() {
        return this.a;
    }

    public egm d() {
        return this.b;
    }

    public is e() {
        return this.c;
    }

    public bgr b(@Nullable is $$0) {
        if (this.g != null) {
            return this.g;
        }
        if ($$0 == null) {
            return bgr.a(bhs.c());
        }
        return bgr.a(bgj.a($$0));
    }

    public boolean f() {
        return this.d;
    }

    public @Nullable ffg g() {
        return this.e;
    }

    public boolean h() {
        return this.j;
    }

    public List<fjn> i() {
        return this.i;
    }

    public boolean j() {
        return this.f == fja.b;
    }

    public fjq.b a(List<fjq.b> $$0, @Nullable is $$1) {
        int $$2 = $$0.size();
        if ($$2 == 0) {
            throw new IllegalStateException("No palettes");
        }
        return $$0.get(this.b($$1).a($$2));
    }

    public fjm c(boolean $$0) {
        this.k = $$0;
        return this;
    }

    public boolean k() {
        return this.k;
    }
}

