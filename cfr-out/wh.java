/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayDeque;
import java.util.Deque;
import org.jspecify.annotations.Nullable;

public class wh
implements vw {
    private final Deque<b> a = new ArrayDeque<b>();

    public wh() {
        this.a.addLast(new d());
    }

    public @Nullable vz d() {
        return this.a.getFirst().a();
    }

    protected int e() {
        return this.a.size() - 1;
    }

    private void a(vz $$0) {
        this.a.getLast().a($$0);
    }

    @Override
    public vw.b a() {
        this.a(vb.b);
        return vw.b.a;
    }

    @Override
    public vw.b a(String $$0) {
        this.a(vx.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(byte $$0) {
        this.a(ux.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(short $$0) {
        this.a(vs.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(int $$0) {
        this.a(ve.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(long $$0) {
        this.a(vh.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(float $$0) {
        this.a(vc.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(double $$0) {
        this.a(va.a($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(byte[] $$0) {
        this.a(new uw($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(int[] $$0) {
        this.a(new vd($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(long[] $$0) {
        this.a(new vg($$0));
        return vw.b.a;
    }

    @Override
    public vw.b a(wb<?> $$0, int $$1) {
        return vw.b.a;
    }

    @Override
    public vw.a b(wb<?> $$0, int $$1) {
        this.c($$0);
        return vw.a.a;
    }

    @Override
    public vw.a a(wb<?> $$0) {
        return vw.a.a;
    }

    @Override
    public vw.a a(wb<?> $$0, String $$1) {
        this.a.getLast().a($$1);
        this.c($$0);
        return vw.a.a;
    }

    private void c(wb<?> $$0) {
        if ($$0 == vf.a) {
            this.a.addLast(new c());
        } else if ($$0 == uz.b) {
            this.a.addLast(new a());
        }
    }

    @Override
    public vw.b b() {
        b $$0 = this.a.removeLast();
        vz $$1 = $$0.a();
        if ($$1 != null) {
            this.a.getLast().a($$1);
        }
        return vw.b.a;
    }

    @Override
    public vw.b b(wb<?> $$0) {
        this.c($$0);
        return vw.b.a;
    }

    static class d
    implements b {
        private @Nullable vz a;

        d() {
        }

        @Override
        public void a(vz $$0) {
            this.a = $$0;
        }

        @Override
        public @Nullable vz a() {
            return this.a;
        }
    }

    static interface b {
        default public void a(String $$0) {
        }

        public void a(vz var1);

        public @Nullable vz a();
    }

    static class c
    implements b {
        private final vf a = new vf();

        c() {
        }

        @Override
        public void a(vz $$0) {
            this.a.a($$0);
        }

        @Override
        public vz a() {
            return this.a;
        }
    }

    static class a
    implements b {
        private final uz a = new uz();
        private String b = "";

        a() {
        }

        @Override
        public void a(String $$0) {
            this.b = $$0;
        }

        @Override
        public void a(vz $$0) {
            this.a.a(this.b, $$0);
        }

        @Override
        public vz a() {
            return this.a;
        }
    }
}

