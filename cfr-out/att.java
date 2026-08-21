/*
 * Decompiled with CFR 0.152.
 */
public class att {
    public static ats<?, ?> a(jq<ats<?, ?>> $$02) {
        att.b($$02);
        att.c($$02);
        att.d($$02);
        att.e($$02);
        att.f($$02);
        att.g($$02);
        att.h($$02);
        att.i($$02);
        return ats.a((auo $$0) -> avi.a(auh.c())).a().b().a("result", auh.h).a($$02, "rpc.discover");
    }

    private static void b(jq<ats<?, ?>> $$0) {
        ats.a(avf::a).a("Get the allowlist").a("allowlist", auh.l.b()).a($$0, "allowlist");
        ats.a(avf::c).a("Set the allowlist").b("players", auh.l.b()).a("allowlist", auh.l.b()).a($$0, "allowlist/set");
        ats.a(avf::a).a("Add players to allowlist").b("add", auh.l.b()).a("allowlist", auh.l.b()).a($$0, "allowlist/add");
        ats.a(avf::b).a("Remove players from allowlist").b("remove", auh.l.b()).a("allowlist", auh.l.b()).a($$0, "allowlist/remove");
        ats.a(avf::a).a("Clear all players in allowlist").a("allowlist", auh.l.b()).a($$0, "allowlist/clear");
    }

    private static void c(jq<ats<?, ?>> $$0) {
        ats.a(avg::a).a("Get the ban list").a("banlist", auh.x.b()).a($$0, "bans");
        ats.a(avg::c).a("Set the banlist").b("bans", auh.x.b()).a("banlist", auh.x.b()).a($$0, "bans/set");
        ats.a(avg::a).a("Add players to ban list").b("add", auh.x.b()).a("banlist", auh.x.b()).a($$0, "bans/add");
        ats.a(avg::b).a("Remove players from ban list").b("remove", auh.l.b()).a("banlist", auh.x.b()).a($$0, "bans/remove");
        ats.a(avg::a).a("Clear all players in ban list").a("banlist", auh.x.b()).a($$0, "bans/clear");
    }

    private static void d(jq<ats<?, ?>> $$0) {
        ats.a(avn::a).a("Get the ip ban list").a("banlist", auh.w.b()).a($$0, "ip_bans");
        ats.a(avn::c).a("Set the ip banlist").b("banlist", auh.w.b()).a("banlist", auh.w.b()).a($$0, "ip_bans/set");
        ats.a(avn::a).a("Add ip to ban list").b("add", auh.v.b()).a("banlist", auh.w.b()).a($$0, "ip_bans/add");
        ats.a(avn::b).a("Remove ip from ban list").b("ip", auh.f.d()).a("banlist", auh.w.b()).a($$0, "ip_bans/remove");
        ats.a(avn::a).a("Clear all ips in ban list").a("banlist", auh.w.b()).a($$0, "ip_bans/clear");
    }

    private static void e(jq<ats<?, ?>> $$0) {
        ats.a(avr::a).a("Get all connected players").a("players", auh.l.b()).a($$0, "players");
        ats.a(avr::a).a("Kick players").b("kick", auh.t.b()).a("kicked", auh.l.b()).a($$0, "players/kick");
    }

    private static void f(jq<ats<?, ?>> $$0) {
        ats.a(avq::a).a("Get all oped players").a("operators", auh.u.b()).a($$0, "operators");
        ats.a(avq::c).a("Set all oped players").b("operators", auh.u.b()).a("operators", auh.u.b()).a($$0, "operators/set");
        ats.a(avq::b).a("Op players").b("add", auh.u.b()).a("operators", auh.u.b()).a($$0, "operators/add");
        ats.a(avq::a).a("Deop players").b("remove", auh.l.b()).a("operators", auh.u.b()).a($$0, "operators/remove");
        ats.a(avq::a).a("Deop all players").a("operators", auh.u.b()).a($$0, "operators/clear");
    }

    private static void g(jq<ats<?, ?>> $$0) {
        ats.a(avu::a).a("Get server status").a("status", auh.n.a()).a($$0, "server/status");
        ats.a(avu::a).a("Save server state").b("flush", auh.b).a("saving", auh.b).a($$0, "server/save");
        ats.a(avu::a).a("Stop server").a("stopping", auh.b).a($$0, "server/stop");
        ats.a(avu::a).a("Send a system message").b("message", auh.s.a()).a("sent", auh.b).a($$0, "server/system_message");
    }

    private static void h(jq<ats<?, ?>> $$0) {
        ats.a(avt::a).a("Get whether automatic world saving is enabled on the server").a("enabled", auh.b).a($$0, "serversettings/autosave");
        ats.a(avt::a).a("Enable or disable automatic world saving on the server").b("enable", auh.b).a("enabled", auh.b).a($$0, "serversettings/autosave/set");
        ats.a(avt::b).a("Get the current difficulty level of the server").a("difficulty", auh.i.a()).a($$0, "serversettings/difficulty");
        ats.a(avt::a).a("Set the difficulty level of the server").b("difficulty", auh.i.a()).a("difficulty", auh.i.a()).a($$0, "serversettings/difficulty/set");
        ats.a(avt::c).a("Get whether allowlist enforcement is enabled (kicks players immediately when removed from allowlist)").a("enforced", auh.b).a($$0, "serversettings/enforce_allowlist");
        ats.a(avt::b).a("Enable or disable allowlist enforcement (when enabled, players are kicked immediately upon removal from allowlist)").b("enforce", auh.b).a("enforced", auh.b).a($$0, "serversettings/enforce_allowlist/set");
        ats.a(avt::d).a("Get whether the allowlist is enabled on the server").a("used", auh.b).a($$0, "serversettings/use_allowlist");
        ats.a(avt::c).a("Enable or disable the allowlist on the server (controls whether only allowlisted players can join)").b("use", auh.b).a("used", auh.b).a($$0, "serversettings/use_allowlist/set");
        ats.a(avt::e).a("Get the maximum number of players allowed to connect to the server").a("max", auh.c).a($$0, "serversettings/max_players");
        ats.a(avt::a).a("Set the maximum number of players allowed to connect to the server").b("max", auh.c).a("max", auh.c).a($$0, "serversettings/max_players/set");
        ats.a(avt::f).a("Get the number of seconds before the game is automatically paused when no players are online").a("seconds", auh.c).a($$0, "serversettings/pause_when_empty_seconds");
        ats.a(avt::b).a("Set the number of seconds before the game is automatically paused when no players are online").b("seconds", auh.c).a("seconds", auh.c).a($$0, "serversettings/pause_when_empty_seconds/set");
        ats.a(avt::g).a("Get the number of seconds before idle players are automatically kicked from the server").a("seconds", auh.c).a($$0, "serversettings/player_idle_timeout");
        ats.a(avt::c).a("Set the number of seconds before idle players are automatically kicked from the server").b("seconds", auh.c).a("seconds", auh.c).a($$0, "serversettings/player_idle_timeout/set");
        ats.a(avt::h).a("Get whether flight is allowed for players in Survival mode").a("allowed", auh.b).a($$0, "serversettings/allow_flight");
        ats.a(avt::d).a("Allow or disallow flight for players in Survival mode").b("allow", auh.b).a("allowed", auh.b).a($$0, "serversettings/allow_flight/set");
        ats.a(avt::j).a("Get the server's message of the day displayed to players").a("message", auh.f).a($$0, "serversettings/motd");
        ats.a(avt::a).a("Set the server's message of the day displayed to players").b("message", auh.f).a("message", auh.f).a($$0, "serversettings/motd/set");
        ats.a(avt::i).a("Get the spawn protection radius in blocks (only operators can edit within this area)").a("radius", auh.c).a($$0, "serversettings/spawn_protection_radius");
        ats.a(avt::d).a("Set the spawn protection radius in blocks (only operators can edit within this area)").b("radius", auh.c).a("radius", auh.c).a($$0, "serversettings/spawn_protection_radius/set");
        ats.a(avt::k).a("Get whether players are forced to use the server's default game mode").a("forced", auh.b).a($$0, "serversettings/force_game_mode");
        ats.a(avt::e).a("Enable or disable forcing players to use the server's default game mode").b("force", auh.b).a("forced", auh.b).a($$0, "serversettings/force_game_mode/set");
        ats.a(avt::l).a("Get the server's default game mode").a("mode", auh.j.a()).a($$0, "serversettings/game_mode");
        ats.a(avt::a).a("Set the server's default game mode").b("mode", auh.j.a()).a("mode", auh.j.a()).a($$0, "serversettings/game_mode/set");
        ats.a(avt::m).a("Get the server's view distance in chunks").a("distance", auh.c).a($$0, "serversettings/view_distance");
        ats.a(avt::e).a("Set the server's view distance in chunks").b("distance", auh.c).a("distance", auh.c).a($$0, "serversettings/view_distance/set");
        ats.a(avt::n).a("Get the server's simulation distance in chunks").a("distance", auh.c).a($$0, "serversettings/simulation_distance");
        ats.a(avt::f).a("Set the server's simulation distance in chunks").b("distance", auh.c).a("distance", auh.c).a($$0, "serversettings/simulation_distance/set");
        ats.a(avt::o).a("Get whether the server accepts player transfers from other servers").a("accepted", auh.b).a($$0, "serversettings/accept_transfers");
        ats.a(avt::f).a("Enable or disable accepting player transfers from other servers").b("accept", auh.b).a("accepted", auh.b).a($$0, "serversettings/accept_transfers/set");
        ats.a(avt::p).a("Get the interval in seconds between server status heartbeats").a("seconds", auh.c).a($$0, "serversettings/status_heartbeat_interval");
        ats.a(avt::g).a("Set the interval in seconds between server status heartbeats").b("seconds", auh.c).a("seconds", auh.c).a($$0, "serversettings/status_heartbeat_interval/set");
        ats.a(avt::q).a("Get default operator permission level").a("level", auh.k).a($$0, "serversettings/operator_user_permission_level");
        ats.a(avt::a).a("Set default operator permission level").b("level", auh.k).a("level", auh.k).a($$0, "serversettings/operator_user_permission_level/set");
        ats.a(avt::r).a("Get whether the server hides online player information from status queries").a("hidden", auh.b).a($$0, "serversettings/hide_online_players");
        ats.a(avt::g).a("Enable or disable hiding online player information from status queries").b("hide", auh.b).a("hidden", auh.b).a($$0, "serversettings/hide_online_players/set");
        ats.a(avt::s).a("Get whether the server responds to connection status requests").a("enabled", auh.b).a($$0, "serversettings/status_replies");
        ats.a(avt::h).a("Enable or disable the server responding to connection status requests").b("enable", auh.b).a("enabled", auh.b).a($$0, "serversettings/status_replies/set");
        ats.a(avt::t).a("Get the entity broadcast range as a percentage").a("percentage_points", auh.c).a($$0, "serversettings/entity_broadcast_range");
        ats.a(avt::h).a("Set the entity broadcast range as a percentage").b("percentage_points", auh.c).a("percentage_points", auh.c).a($$0, "serversettings/entity_broadcast_range/set");
    }

    private static void i(jq<ats<?, ?>> $$0) {
        ats.a(avk::a).a("Get the available game rule keys and their current values").a("gamerules", auh.p.a().d()).a($$0, "gamerules");
        ats.a(avk::a).a("Update game rule value").b("gamerule", auh.q.a()).a("gamerule", auh.p.a()).a($$0, "gamerules/update");
    }
}

