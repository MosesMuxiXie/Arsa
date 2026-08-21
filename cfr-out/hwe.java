/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 */
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hwe<T extends cgh, S, ST extends icz>
extends hwp<T, ST> {
    private final hwo a;

    protected hwe(hwq.a $$0) {
        super($$0);
        this.a = $$0.a();
    }

    @Override
    protected fth a(T $$0) {
        return ((cgh)$$0).e();
    }

    @Override
    protected boolean b(T $$0) {
        return ((cgh)$$0).f();
    }

    private static int c(cgh $$0) {
        cgh.j $$1 = $$0.i();
        return $$1 != null ? $$1.c() : -1;
    }

    @Override
    protected int a(T $$0, is $$1) {
        int $$2 = hwe.c($$0);
        if ($$2 != -1) {
            return hoj.b($$2);
        }
        return super.b($$0, $$1);
    }

    @Override
    protected int b(T $$0, is $$1) {
        int $$2 = hwe.c($$0);
        if ($$2 != -1) {
            return hoj.a($$2);
        }
        return super.a($$0, $$1);
    }

    protected float a(ST $$0) {
        cgh.j $$1 = ((icz)$$0).b;
        if ($$1 == null) {
            return 0.0f;
        }
        return $$1.d().get(((icz)$$0).c);
    }

    @Override
    protected float b(ST $$0) {
        cgh.j $$1 = ((icz)$$0).b;
        if ($$1 == null) {
            return 0.0f;
        }
        return $$1.e().get(((icz)$$0).c);
    }

    @Override
    public void a(ST $$0, fzm $$1, hpo $$2, ikp $$3) {
        cgh.j $$4 = ((icz)$$0).b;
        if ($$4 == null || !((icz)$$0).a()) {
            return;
        }
        float $$5 = ((icz)$$0).c;
        super.a($$0, $$1, $$2, $$3);
        $$1.a();
        $$1.a((Quaternionfc)this.a($$4, $$0, new Quaternionf()));
        i $$6 = $$4.a().get($$5);
        $$1.a($$6.c());
        this.a($$0, $$1, $$2, ((icz)$$0).T, $$5);
        $$1.b();
    }

    private Quaternionf a(cgh.j $$0, ST $$1, Quaternionf $$2) {
        return switch ($$0.b()) {
            default -> throw new MatchException(null, null);
            case cgh.a.a -> $$2.rotationYXZ((float)(-Math.PI) / 180 * ((icz)$$1).d, (float)Math.PI / 180 * ((icz)$$1).e, 0.0f);
            case cgh.a.c -> $$2.rotationYXZ((float)(-Math.PI) / 180 * ((icz)$$1).d, (float)Math.PI / 180 * hwe.b(((icz)$$1).g), 0.0f);
            case cgh.a.b -> $$2.rotationYXZ((float)(-Math.PI) / 180 * hwe.a(((icz)$$1).f), (float)Math.PI / 180 * ((icz)$$1).e, 0.0f);
            case cgh.a.d -> $$2.rotationYXZ((float)(-Math.PI) / 180 * hwe.a(((icz)$$1).f), (float)Math.PI / 180 * hwe.b(((icz)$$1).g), 0.0f);
        };
    }

    private static float a(float $$0) {
        return $$0 - 180.0f;
    }

    private static float b(float $$0) {
        return -$$0;
    }

    private static <T extends cgh> float a(T $$0, float $$1) {
        return $$0.l($$1);
    }

    private static <T extends cgh> float b(T $$0, float $$1) {
        return $$0.k($$1);
    }

    protected abstract void a(ST var1, fzm var2, hpo var3, int var4, float var5);

    @Override
    public void a(T $$0, ST $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ((icz)$$1).b = ((cgh)$$0).i();
        ((icz)$$1).c = ((cgh)$$0).a($$2);
        ((icz)$$1).d = hwe.a($$0, $$2);
        ((icz)$$1).e = hwe.b($$0, $$2);
        ger $$3 = this.a.b;
        ((icz)$$1).g = $$3.e();
        ((icz)$$1).f = $$3.f();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.a((ST)((icz)idf2));
    }

    @Override
    protected /* synthetic */ int a(cgk cgk2, is is2) {
        return this.b((T)((cgh)cgk2), is2);
    }

    @Override
    protected /* synthetic */ int b(cgk cgk2, is is2) {
        return this.a((T)((cgh)cgk2), is2);
    }

    public static class c
    extends hwe<cgh.k, cgh.k.e, ifi> {
        private final gio a;

        protected c(hwq.a $$0) {
            super($$0);
            this.a = $$0.j();
        }

        public ifi a() {
            return new ifi();
        }

        @Override
        public void a(cgh.k $$0, ifi $$1, float $$2) {
            super.a($$0, $$1, $$2);
            $$1.a = $$0.k();
            $$1.h = $$0.a(this::a);
        }

        private cgh.k.b a(yh $$0, int $$1) {
            List<bfr> $$2 = this.a.c($$0, $$1);
            ArrayList<cgh.k.c> $$3 = new ArrayList<cgh.k.c>($$2.size());
            int $$4 = 0;
            for (bfr $$5 : $$2) {
                int $$6 = this.a.a($$5);
                $$4 = Math.max($$4, $$6);
                $$3.add(new cgh.k.c($$5, $$6));
            }
            return new cgh.k.b($$3, $$4);
        }

        @Override
        public void a(ifi $$0, fzm $$1, hpo $$2, int $$3, float $$42) {
            int $$14;
            cgh.k.e $$52 = $$0.a;
            byte $$6 = $$52.e();
            boolean $$7 = ($$6 & 2) != 0;
            boolean $$8 = ($$6 & 4) != 0;
            boolean $$9 = ($$6 & 1) != 0;
            cgh.k.a $$10 = cgh.k.a($$6);
            byte $$11 = (byte)$$52.c().get($$42);
            if ($$8) {
                float $$12 = gfj.V().k.a(0.25f);
                int $$13 = (int)($$12 * 255.0f) << 24;
            } else {
                $$14 = $$52.d().get($$42);
            }
            float $$15 = 0.0f;
            Matrix4f $$16 = $$1.c().a();
            $$16.rotate((float)Math.PI, 0.0f, 1.0f, 0.0f);
            $$16.scale(-0.025f, -0.025f, -0.025f);
            cgh.k.b $$17 = $$0.h;
            boolean $$18 = true;
            int $$19 = this.a.b + 1;
            int $$20 = $$17.b();
            int $$21 = $$17.a().size() * $$19 - 1;
            $$16.translate(1.0f - (float)$$20 / 2.0f, (float)(-$$21), 0.0f);
            if ($$14 != 0) {
                $$2.a($$1, $$7 ? ijt.k() : ijt.j(), (fzm.a $$4, fzp $$5) -> {
                    $$5.a($$4, -1.0f, -1.0f, 0.0f).a($$14).c($$3);
                    $$5.a($$4, -1.0f, (float)$$21, 0.0f).a($$14).c($$3);
                    $$5.a($$4, (float)$$20, (float)$$21, 0.0f).a($$14).c($$3);
                    $$5.a($$4, (float)$$20, -1.0f, 0.0f).a($$14).c($$3);
                });
            }
            hop $$22 = $$2.a($$14 != 0 ? 1 : 0);
            for (cgh.k.c $$23 : $$17.a()) {
                float $$24 = switch ($$10) {
                    default -> throw new MatchException(null, null);
                    case cgh.k.a.b -> 0.0f;
                    case cgh.k.a.c -> $$20 - $$23.b();
                    case cgh.k.a.a -> (float)$$20 / 2.0f - (float)$$23.b() / 2.0f;
                };
                $$22.a($$1, $$24, $$15, $$23.a(), $$9, $$7 ? gio.a.b : gio.a.c, $$3, $$11 << 24 | 0xFFFFFF, 0, 0);
                $$15 += (float)$$19;
            }
        }

        @Override
        public /* synthetic */ idf d() {
            return this.a();
        }

        @Override
        protected /* synthetic */ float c(idf idf2) {
            return super.a((icz)idf2);
        }

        @Override
        protected /* synthetic */ int a(cgk cgk2, is is2) {
            return super.b((cgh)cgk2, is2);
        }

        @Override
        protected /* synthetic */ int b(cgk cgk2, is is2) {
            return super.a((cgh)cgk2, is2);
        }
    }

    public static class b
    extends hwe<cgh.g, cgh.g.a, ied> {
        private final ihk a;

        protected b(hwq.a $$0) {
            super($$0);
            this.a = $$0.b();
        }

        public ied a() {
            return new ied();
        }

        @Override
        public void a(cgh.g $$0, ied $$1, float $$2) {
            super.a($$0, $$1, $$2);
            cgh.g.a $$3 = $$0.k();
            if ($$3 != null) {
                this.a.a($$1.a, $$3.a(), $$3.b(), $$0);
            } else {
                $$1.a.b();
            }
        }

        @Override
        public void a(ied $$0, fzm $$1, hpo $$2, int $$3, float $$4) {
            if ($$0.a.e()) {
                return;
            }
            $$1.a((Quaternionfc)a.d.rotation((float)Math.PI));
            $$0.a.a($$1, $$2, $$3, ilg.d, $$0.U);
        }

        @Override
        public /* synthetic */ idf d() {
            return this.a();
        }

        @Override
        protected /* synthetic */ float c(idf idf2) {
            return super.a((icz)idf2);
        }

        @Override
        protected /* synthetic */ int a(cgk cgk2, is is2) {
            return super.b((cgh)cgk2, is2);
        }

        @Override
        protected /* synthetic */ int b(cgk cgk2, is is2) {
            return super.a((cgh)cgk2, is2);
        }
    }

    public static class a
    extends hwe<cgh.b, cgh.b.a, ico> {
        protected a(hwq.a $$0) {
            super($$0);
        }

        public ico a() {
            return new ico();
        }

        @Override
        public void a(cgh.b $$0, ico $$1, float $$2) {
            super.a($$0, $$1, $$2);
            $$1.a = $$0.k();
        }

        @Override
        public void a(ico $$0, fzm $$1, hpo $$2, int $$3, float $$4) {
            $$2.a($$1, $$0.a.a(), $$3, ilg.d, $$0.U);
        }

        @Override
        public /* synthetic */ idf d() {
            return this.a();
        }

        @Override
        protected /* synthetic */ float c(idf idf2) {
            return super.a((icz)idf2);
        }

        @Override
        protected /* synthetic */ int a(cgk cgk2, is is2) {
            return super.b((cgh)cgk2, is2);
        }

        @Override
        protected /* synthetic */ int b(cgk cgk2, is is2) {
            return super.a((cgh)cgk2, is2);
        }
    }
}

