/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.PolygonMode;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hpa {
    private static final Map<amo, RenderPipeline> aL = new HashMap<amo, RenderPipeline>();
    private static final RenderPipeline.Snippet aM = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withUniform("DynamicTransforms", fyz.a).withUniform("Projection", fyz.a).buildSnippet();
    private static final RenderPipeline.Snippet aN = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withUniform("Fog", fyz.a).buildSnippet();
    private static final RenderPipeline.Snippet aO = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withUniform("Globals", fyz.a).buildSnippet();
    private static final RenderPipeline.Snippet aP = RenderPipeline.builder(aM, aN).buildSnippet();
    private static final RenderPipeline.Snippet aQ = RenderPipeline.builder(aM, aN).withUniform("Lighting", fyz.a).buildSnippet();
    private static final RenderPipeline.Snippet aR = RenderPipeline.builder(aN).withSampler("Sampler0").withSampler("Sampler2").withVertexFormat(fzk.b, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet aS = RenderPipeline.builder(aR).withUniform("Projection", fyz.a).withUniform("ChunkSection", fyz.a).withVertexShader("core/terrain").withFragmentShader("core/terrain").buildSnippet();
    private static final RenderPipeline.Snippet aT = RenderPipeline.builder(aR, aM).withVertexShader("core/block").withFragmentShader("core/block").buildSnippet();
    private static final RenderPipeline.Snippet aU = RenderPipeline.builder(aQ).withVertexShader("core/entity").withFragmentShader("core/entity").withSampler("Sampler0").withSampler("Sampler2").withVertexFormat(fzk.c, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet aV = RenderPipeline.builder(aQ).withVertexShader("core/entity").withFragmentShader("core/entity").withSampler("Sampler0").withVertexFormat(fzk.c, VertexFormat.b.h).withShaderDefine("EMISSIVE").buildSnippet();
    private static final RenderPipeline.Snippet aW = RenderPipeline.builder(aP).withVertexShader("core/rendertype_beacon_beam").withFragmentShader("core/rendertype_beacon_beam").withSampler("Sampler0").withVertexFormat(fzk.b, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet aX = RenderPipeline.builder(aM).withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.k, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet aY = RenderPipeline.builder(aM, aN, aO).withVertexShader("core/rendertype_end_portal").withFragmentShader("core/rendertype_end_portal").withSampler("Sampler0").withSampler("Sampler1").withVertexFormat(fzk.e, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet aZ = RenderPipeline.builder(aP).withVertexShader("core/rendertype_clouds").withFragmentShader("core/rendertype_clouds").withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.a, VertexFormat.b.h).withUniform("CloudInfo", fyz.a).withUniform("CloudFaces", fyz.b, TextureFormat.RED8I).buildSnippet();
    private static final RenderPipeline.Snippet ba = RenderPipeline.builder(aP, aO).withVertexShader("core/rendertype_lines").withFragmentShader("core/rendertype_lines").withBlend(BlendFunction.TRANSLUCENT).withCull(false).withVertexFormat(fzk.o, VertexFormat.b.a).buildSnippet();
    private static final RenderPipeline.Snippet bb = RenderPipeline.builder(aM).withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withVertexFormat(fzk.f, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet bc = RenderPipeline.builder(aP).withVertexShader("core/particle").withFragmentShader("core/particle").withSampler("Sampler0").withSampler("Sampler2").withVertexFormat(fzk.d, VertexFormat.b.h).buildSnippet();
    private static final RenderPipeline.Snippet bd = RenderPipeline.builder(bc).withBlend(BlendFunction.TRANSLUCENT).withCull(false).buildSnippet();
    private static final RenderPipeline.Snippet be = RenderPipeline.builder(aM).withVertexShader("core/gui").withFragmentShader("core/gui").withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.f, VertexFormat.b.h).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).buildSnippet();
    private static final RenderPipeline.Snippet bf = RenderPipeline.builder(aM).withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.j, VertexFormat.b.h).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).buildSnippet();
    private static final RenderPipeline.Snippet bg = RenderPipeline.builder(aX).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).buildSnippet();
    private static final RenderPipeline.Snippet bh = RenderPipeline.builder(aM).withVertexShader("core/rendertype_outline").withFragmentShader("core/rendertype_outline").withSampler("Sampler0").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withVertexFormat(fzk.j, VertexFormat.b.h).buildSnippet();
    public static final RenderPipeline.Snippet a = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withVertexFormat(fzk.a, VertexFormat.b.e).buildSnippet();
    public static final RenderPipeline b = hpa.a(RenderPipeline.builder(aT).withLocation("pipeline/solid_block").build());
    public static final RenderPipeline c = hpa.a(RenderPipeline.builder(aS).withLocation("pipeline/solid_terrain").build());
    public static final RenderPipeline d = hpa.a(RenderPipeline.builder(aS).withLocation("pipeline/wireframe").withPolygonMode(PolygonMode.WIREFRAME).build());
    public static final RenderPipeline e = hpa.a(RenderPipeline.builder(aT).withLocation("pipeline/cutout_block").withShaderDefine("ALPHA_CUTOUT", 0.5f).build());
    public static final RenderPipeline f = hpa.a(RenderPipeline.builder(aS).withLocation("pipeline/cutout_terrain").withShaderDefine("ALPHA_CUTOUT", 0.5f).build());
    public static final RenderPipeline g = hpa.a(RenderPipeline.builder(aS).withLocation("pipeline/translucent_terrain").withBlend(BlendFunction.TRANSLUCENT).withShaderDefine("ALPHA_CUTOUT", 0.01f).build());
    public static final RenderPipeline h = hpa.a(RenderPipeline.builder(aT).withLocation("pipeline/tripwire_block").withShaderDefine("ALPHA_CUTOUT", 0.1f).withBlend(BlendFunction.TRANSLUCENT).build());
    public static final RenderPipeline i = hpa.a(RenderPipeline.builder(aS).withLocation("pipeline/tripwire_terrain").withShaderDefine("ALPHA_CUTOUT", 0.1f).withBlend(BlendFunction.TRANSLUCENT).build());
    public static final RenderPipeline j = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/translucent_moving_block").withVertexShader("core/rendertype_translucent_moving_block").withFragmentShader("core/rendertype_translucent_moving_block").withSampler("Sampler0").withSampler("Sampler2").withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.b, VertexFormat.b.h).build());
    public static final RenderPipeline k = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/armor_cutout_no_cull").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("NO_OVERLAY").withShaderDefine("PER_FACE_LIGHTING").withCull(false).build());
    public static final RenderPipeline l = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/armor_decal_cutout_no_cull").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("NO_OVERLAY").withShaderDefine("PER_FACE_LIGHTING").withCull(false).withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST).build());
    public static final RenderPipeline m = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/armor_translucent").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("NO_OVERLAY").withShaderDefine("PER_FACE_LIGHTING").withBlend(BlendFunction.TRANSLUCENT).withCull(false).build());
    public static final RenderPipeline n = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_solid").withSampler("Sampler1").build());
    public static final RenderPipeline o = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_solid_offset_forward").withSampler("Sampler1").build());
    public static final RenderPipeline p = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_cutout").withShaderDefine("ALPHA_CUTOUT", 0.1f).withSampler("Sampler1").build());
    public static final RenderPipeline q = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_cutout_no_cull").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("PER_FACE_LIGHTING").withSampler("Sampler1").withCull(false).build());
    public static final RenderPipeline r = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_cutout_no_cull_z_offset").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("PER_FACE_LIGHTING").withSampler("Sampler1").withCull(false).build());
    public static final RenderPipeline s = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_translucent").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("PER_FACE_LIGHTING").withSampler("Sampler1").withBlend(BlendFunction.TRANSLUCENT).withCull(false).build());
    public static final RenderPipeline t = hpa.a(RenderPipeline.builder(aV).withLocation("pipeline/entity_translucent_emissive").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("PER_FACE_LIGHTING").withSampler("Sampler1").withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthWrite(false).build());
    public static final RenderPipeline u = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_smooth_cutout").withShaderDefine("ALPHA_CUTOUT", 0.1f).withSampler("Sampler1").withCull(false).build());
    public static final RenderPipeline v = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/entity_no_outline").withShaderDefine("NO_OVERLAY").withShaderDefine("PER_FACE_LIGHTING").withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthWrite(false).build());
    public static final RenderPipeline w = hpa.a(RenderPipeline.builder(aU).withLocation("pipeline/breeze_wind").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("APPLY_TEXTURE_MATRIX").withShaderDefine("NO_OVERLAY").withShaderDefine("NO_CARDINAL_LIGHTING").withBlend(BlendFunction.TRANSLUCENT).withCull(false).build());
    public static final RenderPipeline x = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/energy_swirl").withVertexShader("core/entity").withFragmentShader("core/entity").withShaderDefine("ALPHA_CUTOUT", 0.1f).withShaderDefine("EMISSIVE").withShaderDefine("NO_OVERLAY").withShaderDefine("NO_CARDINAL_LIGHTING").withShaderDefine("APPLY_TEXTURE_MATRIX").withSampler("Sampler0").withBlend(BlendFunction.ADDITIVE).withCull(false).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline y = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/eyes").withVertexShader("core/entity").withFragmentShader("core/entity").withShaderDefine("EMISSIVE").withShaderDefine("NO_OVERLAY").withShaderDefine("NO_CARDINAL_LIGHTING").withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline z = hpa.a(RenderPipeline.builder(aQ).withLocation("pipeline/entity_decal").withVertexShader("core/rendertype_entity_decal").withFragmentShader("core/rendertype_entity_decal").withSampler("Sampler0").withSampler("Sampler1").withSampler("Sampler2").withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST).withCull(false).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline A = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/entity_shadow").withVertexShader("core/rendertype_entity_shadow").withFragmentShader("core/rendertype_entity_shadow").withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline B = hpa.a(RenderPipeline.builder(aQ).withLocation("pipeline/item_entity_translucent_cull").withVertexShader("core/rendertype_item_entity_translucent_cull").withFragmentShader("core/rendertype_item_entity_translucent_cull").withSampler("Sampler0").withSampler("Sampler2").withBlend(BlendFunction.TRANSLUCENT).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline C = hpa.a(RenderPipeline.builder(aW).withLocation("pipeline/beacon_beam_opaque").build());
    public static final RenderPipeline D = hpa.a(RenderPipeline.builder(aW).withLocation("pipeline/beacon_beam_translucent").withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).build());
    public static final RenderPipeline E = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/dragon_explosion_alpha").withVertexShader("core/rendertype_entity_alpha").withFragmentShader("core/rendertype_entity_alpha").withSampler("Sampler0").withCull(false).withVertexFormat(fzk.c, VertexFormat.b.h).build());
    public static final RenderPipeline F = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/leash").withVertexShader("core/rendertype_leash").withFragmentShader("core/rendertype_leash").withSampler("Sampler2").withCull(false).withVertexFormat(fzk.h, VertexFormat.b.f).build());
    public static final RenderPipeline G = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/water_mask").withVertexShader("core/rendertype_water_mask").withFragmentShader("core/rendertype_water_mask").withColorWrite(false).withVertexFormat(fzk.e, VertexFormat.b.h).build());
    public static final RenderPipeline H = hpa.a(RenderPipeline.builder(aM, aN, aO).withLocation("pipeline/glint").withVertexShader("core/glint").withFragmentShader("core/glint").withSampler("Sampler0").withDepthWrite(false).withCull(false).withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST).withBlend(BlendFunction.GLINT).withVertexFormat(fzk.i, VertexFormat.b.h).build());
    public static final RenderPipeline I = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/crumbling").withVertexShader("core/rendertype_crumbling").withFragmentShader("core/rendertype_crumbling").withSampler("Sampler0").withBlend(new BlendFunction(SourceFactor.DST_COLOR, DestFactor.SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO)).withDepthWrite(false).withVertexFormat(fzk.b, VertexFormat.b.h).withDepthBias(-1.0f, -10.0f).build());
    public static final RenderPipeline J = hpa.a(RenderPipeline.builder(aX, aN).withLocation("pipeline/text").withVertexShader("core/rendertype_text").withFragmentShader("core/rendertype_text").withSampler("Sampler0").withSampler("Sampler2").build());
    public static final RenderPipeline K = hpa.a(RenderPipeline.builder(bg, aN).withLocation("pipeline/gui_text").withVertexShader("core/rendertype_text").withFragmentShader("core/rendertype_text").withSampler("Sampler0").withSampler("Sampler2").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).build());
    public static final RenderPipeline L = hpa.a(RenderPipeline.builder(aX, aN).withLocation("pipeline/text_background").withVertexShader("core/rendertype_text_background").withFragmentShader("core/rendertype_text_background").withSampler("Sampler2").withVertexFormat(fzk.h, VertexFormat.b.h).build());
    public static final RenderPipeline M = hpa.a(RenderPipeline.builder(aX, aN).withLocation("pipeline/text_intensity").withVertexShader("core/rendertype_text_intensity").withFragmentShader("core/rendertype_text_intensity").withSampler("Sampler0").withSampler("Sampler2").withDepthBias(-1.0f, -10.0f).build());
    public static final RenderPipeline N = hpa.a(RenderPipeline.builder(bg, aN).withLocation("pipeline/gui_text_intensity").withVertexShader("core/rendertype_text_intensity").withFragmentShader("core/rendertype_text_intensity").withSampler("Sampler0").withSampler("Sampler2").build());
    public static final RenderPipeline O = hpa.a(RenderPipeline.builder(aX, aN).withLocation("pipeline/text_polygon_offset").withVertexShader("core/rendertype_text").withFragmentShader("core/rendertype_text").withSampler("Sampler0").withSampler("Sampler2").withDepthBias(-1.0f, -10.0f).build());
    public static final RenderPipeline P = hpa.a(RenderPipeline.builder(aX).withLocation("pipeline/text_see_through").withVertexShader("core/rendertype_text_see_through").withFragmentShader("core/rendertype_text_see_through").withSampler("Sampler0").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).build());
    public static final RenderPipeline Q = hpa.a(RenderPipeline.builder(aX).withLocation("pipeline/text_background_see_through").withVertexShader("core/rendertype_text_background_see_through").withFragmentShader("core/rendertype_text_background_see_through").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withVertexFormat(fzk.h, VertexFormat.b.h).build());
    public static final RenderPipeline R = hpa.a(RenderPipeline.builder(aX).withLocation("pipeline/text_intensity_see_through").withVertexShader("core/rendertype_text_intensity_see_through").withFragmentShader("core/rendertype_text_intensity_see_through").withSampler("Sampler0").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).build());
    public static final RenderPipeline S = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/lightning").withVertexShader("core/rendertype_lightning").withFragmentShader("core/rendertype_lightning").withBlend(BlendFunction.LIGHTNING).withVertexFormat(fzk.f, VertexFormat.b.h).build());
    public static final RenderPipeline T = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/dragon_rays").withVertexShader("core/rendertype_lightning").withFragmentShader("core/rendertype_lightning").withDepthWrite(false).withBlend(BlendFunction.LIGHTNING).withVertexFormat(fzk.f, VertexFormat.b.e).build());
    public static final RenderPipeline U = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/dragon_rays_depth").withVertexShader("core/position").withFragmentShader("core/position").withColorWrite(false).withVertexFormat(fzk.e, VertexFormat.b.e).build());
    public static final RenderPipeline V = hpa.a(RenderPipeline.builder(aY).withLocation("pipeline/end_portal").withShaderDefine("PORTAL_LAYERS", 15).build());
    public static final RenderPipeline W = hpa.a(RenderPipeline.builder(aY).withLocation("pipeline/end_gateway").withShaderDefine("PORTAL_LAYERS", 16).build());
    public static final RenderPipeline X = hpa.a(RenderPipeline.builder(aZ).withLocation("pipeline/flat_clouds").withCull(false).build());
    public static final RenderPipeline Y = hpa.a(RenderPipeline.builder(aZ).withLocation("pipeline/clouds").build());
    public static final RenderPipeline Z = hpa.a(RenderPipeline.builder(ba).withLocation("pipeline/lines").build());
    public static final RenderPipeline aa = hpa.a(RenderPipeline.builder(ba).withDepthWrite(false).withLocation("pipeline/lines_translucent").build());
    public static final RenderPipeline ab = hpa.a(RenderPipeline.builder(ba).withLocation("pipeline/secondary_block_outline").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).build());
    public static final RenderPipeline ac = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/debug_points").withVertexShader("core/debug_point").withFragmentShader("core/position_color").withCull(false).withVertexFormat(fzk.n, VertexFormat.b.d).build());
    public static final RenderPipeline ad = hpa.a(RenderPipeline.builder(bb).withLocation("pipeline/debug_filled_box").build());
    public static final RenderPipeline ae = hpa.a(RenderPipeline.builder(bb).withLocation("pipeline/debug_quads").withCull(false).build());
    public static final RenderPipeline af = hpa.a(RenderPipeline.builder(bb).withLocation("pipeline/debug_triangle_fan").withCull(false).withVertexFormat(fzk.f, VertexFormat.b.g).build());
    public static final RenderPipeline ag = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/world_border").withVertexShader("core/rendertype_world_border").withFragmentShader("core/rendertype_world_border").withSampler("Sampler0").withBlend(BlendFunction.OVERLAY).withCull(false).withVertexFormat(fzk.i, VertexFormat.b.h).withDepthBias(-3.0f, -3.0f).build());
    public static final RenderPipeline ah = hpa.a(RenderPipeline.builder(bc).withLocation("pipeline/opaque_particle").build());
    public static final RenderPipeline ai = hpa.a(RenderPipeline.builder(bc).withLocation("pipeline/translucent_particle").withBlend(BlendFunction.TRANSLUCENT).build());
    public static final RenderPipeline aj = hpa.a(RenderPipeline.builder(bd).withLocation("pipeline/weather_depth_write").build());
    public static final RenderPipeline ak = hpa.a(RenderPipeline.builder(bd).withLocation("pipeline/weather_no_depth_write").withDepthWrite(false).build());
    public static final RenderPipeline al = hpa.a(RenderPipeline.builder(aP).withLocation("pipeline/sky").withVertexShader("core/sky").withFragmentShader("core/sky").withDepthWrite(false).withVertexFormat(fzk.e, VertexFormat.b.g).build());
    public static final RenderPipeline am = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/end_sky").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withVertexFormat(fzk.j, VertexFormat.b.h).build());
    public static final RenderPipeline an = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/sunrise_sunset").withVertexShader("core/position_color").withFragmentShader("core/position_color").withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withVertexFormat(fzk.f, VertexFormat.b.g).build());
    public static final RenderPipeline ao = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/stars").withVertexShader("core/stars").withFragmentShader("core/stars").withBlend(BlendFunction.OVERLAY).withDepthWrite(false).withVertexFormat(fzk.e, VertexFormat.b.h).build());
    public static final RenderPipeline ap = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/celestial").withVertexShader("core/position_tex").withFragmentShader("core/position_tex").withSampler("Sampler0").withBlend(BlendFunction.OVERLAY).withDepthWrite(false).withVertexFormat(fzk.i, VertexFormat.b.h).build());
    public static final RenderPipeline aq = hpa.a(RenderPipeline.builder(be).withLocation("pipeline/gui").build());
    public static final RenderPipeline ar = hpa.a(RenderPipeline.builder(be).withLocation("pipeline/gui_invert").withBlend(BlendFunction.INVERT).build());
    public static final RenderPipeline as = hpa.a(RenderPipeline.builder(be).withLocation("pipeline/gui_text_highlight").withBlend(BlendFunction.ADDITIVE).build());
    public static final RenderPipeline at = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/gui_textured").build());
    public static final RenderPipeline au = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/gui_textured_premultiplied_alpha").withBlend(BlendFunction.TRANSLUCENT_PREMULTIPLIED_ALPHA).build());
    public static final RenderPipeline av = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/block_screen_effect").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build());
    public static final RenderPipeline aw = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/fire_screen_effect").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build());
    public static final RenderPipeline ax = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/gui_opaque_textured_background").withoutBlend().build());
    public static final RenderPipeline ay = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/gui_nausea_overlay").withBlend(BlendFunction.ADDITIVE).build());
    public static final RenderPipeline az = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/vignette").withBlend(new BlendFunction(SourceFactor.ZERO, DestFactor.ONE_MINUS_SRC_COLOR)).build());
    public static final RenderPipeline aA = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/crosshair").withBlend(BlendFunction.INVERT).build());
    public static final RenderPipeline aB = hpa.a(RenderPipeline.builder(bf).withLocation("pipeline/mojang_logo").withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE)).build());
    public static final RenderPipeline aC = hpa.a(RenderPipeline.builder(new RenderPipeline.Snippet[0]).withLocation("pipeline/entity_outline_blit").withVertexShader("core/screenquad").withFragmentShader("core/blit_screen").withSampler("InSampler").withBlend(BlendFunction.ENTITY_OUTLINE_BLIT).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withColorWrite(true, false).withVertexFormat(fzk.a, VertexFormat.b.e).build());
    public static final RenderPipeline aD = hpa.a(RenderPipeline.builder(new RenderPipeline.Snippet[0]).withLocation("pipeline/tracy_blit").withVertexShader("core/screenquad").withFragmentShader("core/blit_screen").withSampler("InSampler").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withVertexFormat(fzk.a, VertexFormat.b.e).build());
    public static final RenderPipeline aE = hpa.a(RenderPipeline.builder(aM).withLocation("pipeline/panorama").withVertexShader("core/panorama").withFragmentShader("core/panorama").withSampler("Sampler0").withDepthWrite(false).withColorWrite(true, false).withVertexFormat(fzk.e, VertexFormat.b.h).build());
    public static final RenderPipeline aF = hpa.a(RenderPipeline.builder(bh).withLocation("pipeline/outline_cull").build());
    public static final RenderPipeline aG = hpa.a(RenderPipeline.builder(bh).withLocation("pipeline/outline_no_cull").withCull(false).build());
    public static final RenderPipeline aH = hpa.a(RenderPipeline.builder(new RenderPipeline.Snippet[0]).withLocation("pipeline/lightmap").withVertexShader("core/screenquad").withFragmentShader("core/lightmap").withUniform("LightmapInfo", fyz.a).withVertexFormat(fzk.a, VertexFormat.b.e).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).build());
    public static final RenderPipeline.Snippet aI = RenderPipeline.builder(new RenderPipeline.Snippet[0]).withVertexShader("core/animate_sprite").withUniform("SpriteAnimationInfo", fyz.a).withVertexFormat(fzk.a, VertexFormat.b.e).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).buildSnippet();
    public static final RenderPipeline aJ = hpa.a(RenderPipeline.builder(aI).withFragmentShader("core/animate_sprite_blit").withLocation("pipeline/animate_sprite_blit").withSampler("Sprite").build());
    public static final RenderPipeline aK = hpa.a(RenderPipeline.builder(aI).withFragmentShader("core/animate_sprite_interpolate").withLocation("pipeline/animate_sprite_interpolate").withSampler("CurrentSprite").withSampler("NextSprite").build());

    private static RenderPipeline a(RenderPipeline $$0) {
        aL.put($$0.getLocation(), $$0);
        return $$0;
    }

    public static List<RenderPipeline> a() {
        return aL.values().stream().toList();
    }
}

