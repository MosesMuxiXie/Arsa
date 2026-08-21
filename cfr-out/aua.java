/*
 * Decompiled with CFR 0.152.
 */
public class aua {
    public static final jd.c<atz<Void, Void>> a = atz.c().a("Server started").b("server/started");
    public static final jd.c<atz<Void, Void>> b = atz.c().a("Server shutting down").b("server/stopping");
    public static final jd.c<atz<Void, Void>> c = atz.c().a("Server save started").b("server/saving");
    public static final jd.c<atz<Void, Void>> d = atz.c().a("Server save completed").b("server/saved");
    public static final jd.c<atz<Void, Void>> e = atz.c().a("Server activity occurred. Rate limited to 1 notification per 30 seconds").b("server/activity");
    public static final jd.c<atz<aue, Void>> f = atz.d().b("player", auh.l.a()).a("Player joined").b("players/joined");
    public static final jd.c<atz<aue, Void>> g = atz.d().b("player", auh.l.a()).a("Player left").b("players/left");
    public static final jd.c<atz<avq.b, Void>> h = atz.d().b("player", auh.u.a()).a("Player was oped").b("operators/added");
    public static final jd.c<atz<avq.b, Void>> i = atz.d().b("player", auh.u.a()).a("Player was deoped").b("operators/removed");
    public static final jd.c<atz<aue, Void>> j = atz.d().b("player", auh.l.a()).a("Player was added to allowlist").b("allowlist/added");
    public static final jd.c<atz<aue, Void>> k = atz.d().b("player", auh.l.a()).a("Player was removed from allowlist").b("allowlist/removed");
    public static final jd.c<atz<avn.c, Void>> l = atz.d().b("player", auh.w.a()).a("Ip was added to ip ban list").b("ip_bans/added");
    public static final jd.c<atz<String, Void>> m = atz.d().b("player", auh.f).a("Ip was removed from ip ban list").b("ip_bans/removed");
    public static final jd.c<atz<avg.b, Void>> n = atz.d().b("player", auh.x.a()).a("Player was added to ban list").b("bans/added");
    public static final jd.c<atz<aue, Void>> o = atz.d().b("player", auh.l.a()).a("Player was removed from ban list").b("bans/removed");
    public static final jd.c<atz<avk.a<?>, Void>> p = atz.d().b("gamerule", auh.p.a()).a("Gamerule was changed").b("gamerules/updated");
    public static final jd.c<atz<avu.a, Void>> q = atz.d().b("status", auh.n.a()).a("Server status heartbeat").b("server/status");
}

