/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public abstract class gjk<E extends a<E>>
extends giy<E> {
    public gjk(gfj $$0, int $$1, int $$2, int $$3, int $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public @Nullable gin a(gpi $$02) {
        if (this.u() == 0) {
            return null;
        }
        if ($$02 instanceof gpi.a) {
            gin $$6;
            gpi.a $$1 = (gpi.a)$$02;
            a $$2 = (a)this.r();
            if ($$1.b().a() == gpj.a && $$2 != null) {
                return gin.a(this, $$2.a($$02));
            }
            int $$3 = -1;
            gpk $$4 = $$1.b();
            if ($$2 != null) {
                $$3 = $$2.aJ_().indexOf($$2.aO_());
            }
            if ($$3 == -1) {
                switch ($$4) {
                    case c: {
                        $$3 = Integer.MAX_VALUE;
                        $$4 = gpk.b;
                        break;
                    }
                    case d: {
                        $$3 = 0;
                        $$4 = gpk.b;
                        break;
                    }
                    default: {
                        $$3 = 0;
                    }
                }
            }
            a $$5 = $$2;
            do {
                if (($$5 = this.a($$4, (E $$0) -> !$$0.aJ_().isEmpty(), $$5)) != null) continue;
                return null;
            } while (($$6 = $$5.a($$1, $$3)) == null);
            return gin.a(this, $$6);
        }
        return super.a($$02);
    }

    @Override
    public void a(@Nullable gmm $$0) {
        if (this.r() == $$0) {
            return;
        }
        super.a($$0);
        if ($$0 == null) {
            this.a(null);
        }
    }

    @Override
    public gpb.a y() {
        if (this.aP_()) {
            return gpb.a.c;
        }
        return super.y();
    }

    @Override
    protected boolean v() {
        return false;
    }

    @Override
    public void a(gpd $$0) {
        Object e2 = this.z();
        if (e2 instanceof a) {
            a $$1 = (a)e2;
            $$1.a($$0.a());
            this.a($$0, $$1);
        } else {
            e2 = this.r();
            if (e2 instanceof a) {
                a $$2 = (a)e2;
                $$2.a($$0.a());
                this.a($$0, $$2);
            }
        }
    }

    public static abstract class a<E extends a<E>>
    extends giy.a<E>
    implements gml {
        private @Nullable gmm a;
        private @Nullable gpb b;
        private boolean c;

        @Override
        public boolean aN_() {
            return this.c;
        }

        @Override
        public void c_(boolean $$0) {
            this.c = $$0;
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            return gml.super.a($$0, $$1);
        }

        @Override
        public void a(@Nullable gmm $$0) {
            if (this.a != null) {
                this.a.b(false);
            }
            if ($$0 != null) {
                $$0.b(true);
            }
            this.a = $$0;
        }

        @Override
        public @Nullable gmm aO_() {
            return this.a;
        }

        public @Nullable gin a(gpi $$0, int $$1) {
            if (this.aJ_().isEmpty()) {
                return null;
            }
            gin $$2 = this.aJ_().get(Math.min($$1, this.aJ_().size() - 1)).a($$0);
            return gin.a(this, $$2);
        }

        @Override
        public @Nullable gin a(gpi $$0) {
            if ($$0 instanceof gpi.a) {
                int $$3;
                int $$2;
                gpi.a $$1 = (gpi.a)$$0;
                switch ($$1.b()) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case a: 
                    case b: {
                        int n2 = 0;
                        break;
                    }
                    case c: {
                        int n2 = -1;
                        break;
                    }
                    case d: {
                        int n2 = $$2 = 1;
                    }
                }
                if ($$2 == 0) {
                    return null;
                }
                for (int $$4 = $$3 = bgj.a($$2 + this.aJ_().indexOf(this.aO_()), 0, this.aJ_().size() - 1); $$4 >= 0 && $$4 < this.aJ_().size(); $$4 += $$2) {
                    gmm $$5 = this.aJ_().get($$4);
                    gin $$6 = $$5.a($$0);
                    if ($$6 == null) continue;
                    return gin.a(this, $$6);
                }
            }
            return gml.super.a($$0);
        }

        public abstract List<? extends gpb> b();

        void a(gpd $$0) {
            List<gpb> $$1 = this.b();
            gsb.a $$2 = gsb.a($$1, this.b);
            if ($$2 != null) {
                if ($$2.c().a()) {
                    this.b = $$2.a();
                }
                if ($$1.size() > 1) {
                    $$0.a(gpc.b, (yh)yh.a("narrator.position.object_list", $$2.b() + 1, $$1.size()));
                }
                $$2.a().b($$0.a());
            }
        }
    }
}

