/*
 * Decompiled with CFR 0.152.
 */
public class grv
extends gsb {
    private static final yh a = yh.c("outOfMemory.title");
    private static final yh b = yh.c("outOfMemory.message");
    private static final int c = 300;
    private final gou d = new gou(this);

    public grv() {
        super(a);
    }

    @Override
    protected void bg_() {
        this.d.a(a, this.q);
        this.d.c(gjp.a(b, this.q).a(300).a());
        goy $$02 = this.d.b(goy.e().a(8));
        $$02.a(gje.a(yg.l, (gje $$0) -> this.n.a(new gsd())).a());
        $$02.a(gje.a(yh.c("menu.quit"), (gje $$0) -> this.n.u()).a());
        this.d.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        this.d.a();
    }

    @Override
    public boolean aY_() {
        return false;
    }
}

