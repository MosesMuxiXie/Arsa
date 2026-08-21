/*
 * Decompiled with CFR 0.152.
 */
public class avb
implements ava {
    private final ary a;
    private final atw b;

    public avb(ary $$0, atw $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public boolean a() {
        return this.a.bp();
    }

    @Override
    public boolean a(boolean $$0, avh $$1) {
        this.b.a($$1, "Update autosave from {} to {}", this.a(), $$0);
        this.a.i($$0);
        return this.a();
    }

    @Override
    public ccz b() {
        return this.a.bb().p();
    }

    @Override
    public ccz a(ccz $$0, avh $$1) {
        this.b.a($$1, "Update difficulty from '{}' to '{}'", this.b(), $$0);
        this.a.a($$0);
        return this.b();
    }

    @Override
    public boolean c() {
        return this.a.aO();
    }

    @Override
    public boolean b(boolean $$0, avh $$1) {
        this.b.a($$1, "Update enforce allowlist from {} to {}", this.c(), $$0);
        this.a.g($$0);
        this.a.aD();
        return this.c();
    }

    @Override
    public boolean d() {
        return this.a.aP();
    }

    @Override
    public boolean c(boolean $$0, avh $$1) {
        this.b.a($$1, "Update using allowlist from {} to {}", this.d(), $$0);
        this.a.h($$0);
        this.a.aD();
        return this.d();
    }

    @Override
    public int e() {
        return this.a.r();
    }

    @Override
    public int a(int $$0, avh $$1) {
        this.b.a($$1, "Update max players from {} to {}", this.e(), $$0);
        this.a.g($$0);
        return this.e();
    }

    @Override
    public int f() {
        return this.a.bu();
    }

    @Override
    public int b(int $$0, avh $$1) {
        this.b.a($$1, "Update pause when empty from {} seconds to {} seconds", this.f(), $$0);
        this.a.k($$0);
        return this.f();
    }

    @Override
    public int g() {
        return this.a.aq();
    }

    @Override
    public int c(int $$0, avh $$1) {
        this.b.a($$1, "Update player idle timeout from {} minutes to {} minutes", this.g(), $$0);
        this.a.d($$0);
        return this.g();
    }

    @Override
    public boolean h() {
        return this.a.ag();
    }

    @Override
    public boolean d(boolean $$0, avh $$1) {
        this.b.a($$1, "Update allow flight from {} to {}", this.h(), $$0);
        this.a.j($$0);
        return this.h();
    }

    @Override
    public int i() {
        return this.a.bC();
    }

    @Override
    public int d(int $$0, avh $$1) {
        this.b.a($$1, "Update spawn protection radius from {} to {}", this.i(), $$0);
        this.a.h($$0);
        return this.i();
    }

    @Override
    public String j() {
        return this.a.ah();
    }

    @Override
    public String a(String $$0, avh $$1) {
        this.b.a($$1, "Update MOTD from '{}' to '{}'", this.j(), $$0);
        this.a.d($$0);
        return this.j();
    }

    @Override
    public boolean k() {
        return this.a.bH();
    }

    @Override
    public boolean e(boolean $$0, avh $$1) {
        this.b.a($$1, "Update force game mode from {} to {}", this.k(), $$0);
        this.a.m($$0);
        return this.k();
    }

    @Override
    public dwl l() {
        return this.a.bI();
    }

    @Override
    public dwl a(dwl $$0, avh $$1) {
        this.b.a($$1, "Update game mode from '{}' to '{}'", this.l(), $$0);
        this.a.c($$0);
        return this.l();
    }

    @Override
    public int m() {
        return this.a.bx();
    }

    @Override
    public int e(int $$0, avh $$1) {
        this.b.a($$1, "Update view distance from {} to {}", this.m(), $$0);
        this.a.e($$0);
        return this.m();
    }

    @Override
    public int n() {
        return this.a.by();
    }

    @Override
    public int f(int $$0, avh $$1) {
        this.b.a($$1, "Update simulation distance from {} to {}", this.n(), $$0);
        this.a.f($$0);
        return this.n();
    }

    @Override
    public boolean o() {
        return this.a.bq();
    }

    @Override
    public boolean f(boolean $$0, avh $$1) {
        this.b.a($$1, "Update accepts transfers from {} to {}", this.o(), $$0);
        this.a.n($$0);
        return this.o();
    }

    @Override
    public int p() {
        return this.a.bD();
    }

    @Override
    public int g(int $$0, avh $$1) {
        this.b.a($$1, "Update status heartbeat interval from {} to {}", this.p(), $$0);
        this.a.i($$0);
        return this.p();
    }

    @Override
    public bbh q() {
        return this.a.k();
    }

    @Override
    public bbh a(bbh $$0, avh $$1) {
        this.b.a($$1, "Update operator user permission level from {} to {}", this.q(), $$0.a());
        this.a.a($$0);
        return this.q();
    }

    @Override
    public boolean r() {
        return this.a.ao();
    }

    @Override
    public boolean g(boolean $$0, avh $$1) {
        this.b.a($$1, "Update hides online players from {} to {}", this.r(), $$0);
        this.a.l($$0);
        return this.r();
    }

    @Override
    public boolean s() {
        return this.a.an();
    }

    @Override
    public boolean h(boolean $$0, avh $$1) {
        this.b.a($$1, "Update replies to status from {} to {}", this.s(), $$0);
        this.a.k($$0);
        return this.s();
    }

    @Override
    public int t() {
        return this.a.bG();
    }

    @Override
    public int h(int $$0, avh $$1) {
        this.b.a($$1, "Update entity broadcast range percentage from {}% to {}%", this.t(), $$0);
        this.a.j($$0);
        return this.t();
    }
}

