package net.optifine.features.module.world;

import com.mojang.blaze3d.systems.RenderSystem;
import com.sun.javafx.geom.CubicCurve2D;
import net.optifine.Global;
import net.optifine.config.BooleanSetting;
import net.optifine.config.EnumSetting;
import net.optifine.config.NumberSetting;
import net.optifine.config.Splitter;
import net.optifine.managers.event.events.JumpBoostEventListener;
import net.optifine.managers.event.events.JumpBoostEventListener.JumpBoostEvent;
import net.optifine.managers.event.events.Render2DListener;
import net.optifine.managers.event.events.RenderListener;
import net.optifine.managers.event.events.StrafeEventListener;
import net.optifine.managers.event.events.StrafeEventListener.StrafeEvent;
import net.optifine.util.BlockUtils;
import net.optifine.util.MovementUtils;
import net.optifine.util.RotationUtils;
import net.optifine.util.RotationUtils.Rotation;
import net.optifine.util.math.MathUtils;
import net.optifine.util.render.RenderUtils;
import net.optifine.util.theme.ThemeManager;
import net.minecraft.*;
import net.minecraft.class_2848.class_2849;
import net.minecraft.class_4493.class_4534;
import net.minecraft.class_4493.class_4535;
import net.minecraft.class_4597.class_4598;
import net.minecraft.class_809.class_811;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;
import net.optifine.features.module.util.Timer;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public final class Scaffold extends Module implements RenderListener, JumpBoostEventListener, Render2DListener, StrafeEventListener {
   // $FF: synthetic field
   int William;
   // $FF: synthetic field
   private final CubicCurve2D SuSAn;
   // $FF: synthetic field
   private final NumberSetting WIlliam;
   // $FF: synthetic field
   private final NumberSetting JameS;
   // $FF: synthetic field
   int Elizabeth;
   // $FF: synthetic field
   int Jacob;
   // $FF: synthetic field
   private final NumberSetting OscarW;
   // $FF: synthetic field
   private final BooleanSetting MAry;
   // $FF: synthetic field
   int Linda;
   // $FF: synthetic field
   private final BooleanSetting JaCk;
   // $FF: synthetic field
   int James;
   // $FF: synthetic field
   private final BooleanSetting Georgee;
   // $FF: synthetic field
   EnumSetting< SwitchMode> Jack;
   // $FF: synthetic field
   private final NumberSetting LindA;
   // $FF: synthetic field
   class_3541 Patricia;
   // $FF: synthetic field
   static final boolean Margaret;
   // $FF: synthetic field
   private final BooleanSetting HaRry;
   // $FF: synthetic field
   private final BooleanSetting BarbarA;
   // $FF: synthetic field
   float George;
   // $FF: synthetic field
   private final NumberSetting ElizabetTH;
   // $FF: synthetic field
   private final NumberSetting JennifeR;
   // $FF: synthetic field
   int Charlie;
   // $FF: synthetic field
   int Barbara;
   // $FF: synthetic field
   private final NumberSetting ThomaSS;
   // $FF: synthetic field
   private final NumberSetting JacoB;
   // $FF: synthetic field
   int Thomas;
   // $FF: synthetic field
   float Oscar;
   // $FF: synthetic field
   class_2338 Harry;
   // $FF: synthetic field
   boolean Jennifer;
   // $FF: synthetic field
   private final NumberSetting CharliE;
   // $FF: synthetic field
   double Susan;
   // $FF: synthetic field
   private final BooleanSetting OlIver;
   // $FF: synthetic field
   private final BooleanSetting PaTRicia;
   // $FF: synthetic field
   boolean Mary;
   // $FF: synthetic field
   private final BooleanSetting Sarah;
   // $FF: synthetic field
   private final BooleanSetting Jessica;

   private static int lIlIIlII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void onRender2D(class_4587 matrixStack, float partialTicks) {
      double width = (double)mc.method_22683().method_4486();
      double height = (double)mc.method_22683().method_4502();
      boolean var10000;
      if (this.Thomas == -1 && !class_1792.field_8003.containsValue(mc.field_1724.field_7514.method_5438(this.Elizabeth).method_7909())) {
         var10000 = false;
      } else {
         var10000 = true;
         "".length();
         if (" ".length() >= "  ".length()) {
            return;
         }
      }

      boolean b = var10000;
      double var10001 = this.Susan;
      double var10002;
      if (b) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (" ".length() > "  ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Susan = var10001 + var10002;
      this.Susan = MathUtils.clamp(-1.5D, this.Susan, 1.5D);
      double result = (double)this.SuSAn.eval((float)(this.Susan / 3.0D + 0.5D)).y;
      int expand = (int)(result * 20.0D);
      if (lIlIIlll(result, 0.001D) > 0 && b) {
         int x = (int)(width / 2.0D - 8.0D);
         int y = (int)(height / 2.0D + 17.0D);
         class_1087 bm = mc.method_1480().method_4019(mc.field_1724.field_7514.method_5438(this.Elizabeth), (class_1937)null, (class_1309)null);
         RenderSystem.pushMatrix();
         mc.method_1531().method_22813(class_1059.field_5275);
         mc.method_1531().method_4619(class_1059.field_5275).method_4527(false, false);
         RenderSystem.enableRescaleNormal();
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(class_4535.field_22541, class_4534.field_22523);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, (float)result);
         RenderSystem.translatef((float)x, (float)y, 100.0F + mc.method_1480().field_4730);
         RenderSystem.translatef(8.0F, 8.0F, 0.0F);
         RenderSystem.scalef(1.0F, -1.0F, 1.0F);
         RenderSystem.scalef(16.0F, 16.0F, 16.0F);
         new class_4587();
         class_4598 immediate = class_310.method_1551().method_22940().method_23000();
         if (!bm.method_24304()) {
            var10000 = true;
            "".length();
            if (-"   ".length() >= 0) {
               return;
            }
         } else {
            var10000 = false;
         }

         boolean bl = var10000;
         if (bl) {
            class_308.method_24210();
         }

         mc.method_1480().method_23179(mc.field_1724.field_7514.method_5438(this.Elizabeth), class_811.field_4317, false, matrixStack, immediate, 15728880, class_4608.field_21444, bm);
         immediate.method_22993();
         RenderSystem.enableDepthTest();
         if (bl) {
            class_308.method_24211();
         }

         RenderSystem.disableAlphaTest();
         RenderSystem.disableRescaleNormal();
         RenderSystem.popMatrix();
      }

      RenderUtils.drawRoundedRectWithShadow(width / 2.0D - 10.0D, height / 2.0D + 15.0D, width / 2.0D + 10.0D, height / 2.0D + 28.0D + (double)expand, 2.0D, (new Color(17, 17, 17, 120)).getRGB(), 0.0D, 0.0D, 15.0D, (new Color(17, 17, 17, 80)).getRGB());
      Global.Harry.getSmallMain().drawCenteredString(String.valueOf(this.Barbara), width / 2.0D, height / 2.0D + 22.0D + (double)expand, 1090519039);
      "".length();
      if (-"   ".length() < 0) {
         ;
      }
   }

   private static int lIlIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      boolean var10000;
      if (!Scaffold.class.desiredAssertionStatus()) {
         var10000 = true;
         "".length();
         if (" ".length() <= "".length()) {
            return;
         }
      } else {
         var10000 = false;
      }

      Margaret = var10000;
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIlIIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(StrafeEvent event) {
      if (this.Elizabeth != this.Thomas) {
         this.Thomas = -1;
      }

      if (!Margaret && mc.field_1724 == null) {
         throw new AssertionError();
      } else {
         if (mc.field_1724.method_24828()) {
            this.Jacob = mc.field_1724.method_24515().method_10264();
         }

         int shouldSelect = 0;
         Global.Thomas.Harry = this.Georgee.Jack();
         class_2338 pbp = mc.field_1724.method_24515();
         class_2338 smybp = new class_2338(pbp.method_10263(), this.Jacob, pbp.method_10260());
         class_2338 var10000;
         if (this.MAry.Jack()) {
            var10000 = smybp;
            "".length();
            if (" ".length() < 0) {
               return;
            }
         } else {
            var10000 = pbp;
         }

         boolean var30;
         if (!BlockUtils.getState(var10000.method_10069(0, -1, 0)).method_26207().method_15799()) {
            var30 = true;
            "".length();
            if ((124 ^ 120) < -" ".length()) {
               return;
            }
         } else {
            var30 = false;
         }

         boolean shouldPlace = var30;
         int slot = mc.field_1724.field_7514.field_7545;
         this.Elizabeth = slot;

         class_238 b;
         label299: {
            try {
               b = ((class_2680)((class_1747)mc.field_1724.field_7514.method_5438(slot).method_7909()).method_7711().method_9595().method_11664()).method_26220(mc.field_1687, new class_2338(-324324, 255, 325235)).method_1107();
            } catch (Exception var27) {
               b = new class_238(new class_243(0.0D, 0.0D, 0.0D), new class_243(0.0D, 0.0D, 0.0D));
               break label299;
            }

            "".length();
            if (null != null) {
               return;
            }
         }

         if (b != null && lIlIIIll(b.method_17941(), 1.0D) == 0 && lIlIIIll(b.method_17940(), 1.0D) == 0 && lIlIIIll(b.method_17939(), 1.0D) == 0) {
            var30 = true;
            "".length();
            if ((21 ^ 16) == 0) {
               return;
            }
         } else {
            var30 = false;
         }

         boolean blockSelected = var30;
         boolean done = false;
         int items = -1;
         if (this.Jack.Harry() != SwitchMode.Harry && shouldPlace) {
            int i = 0;

            while(i < 9) {
               if (class_1792.field_8003.containsValue(mc.field_1724.field_7514.method_5438(i).method_7909())) {
                  this.Thomas = i;
                  shouldSelect = i;
                  if (!done && !blockSelected && this.Jack.Harry() == SwitchMode.Jack) {
                     mc.field_1724.field_7514.field_7545 = i;
                  }

                  items += mc.field_1724.field_7514.method_5438(i).method_7947();
                  done = true;
               }

               ++i;
               "".length();
               if ("".length() > " ".length()) {
                  return;
               }
            }
         }

         if (items != -1) {
            this.Barbara = items;
         }

         if (this.Mary) {
            event.Jack = (float)((double)event.Jack * this.JacoB.Jack());
            "".length();
            if ("".length() != 0) {
               return;
            }
         } else {
            event.Jack *= this.CharliE.George();
            mc.field_1724.method_5728(this.HaRry.Jack());
         }

         boolean var10001;
         if ((b == null || lIlIIIll(b.method_17941(), 1.0D) != 0 || lIlIIIll(b.method_17940(), 1.0D) != 0 || lIlIIIll(b.method_17939(), 1.0D) != 0) && SwitchMode.Oliver != this.Jack.Harry()) {
            var10001 = false;
         } else {
            var10001 = true;
            "".length();
            if ("".length() > 0) {
               return;
            }
         }

         shouldPlace &= var10001;
         if (shouldPlace && this.JaCk.Jack() && this.Jennifer) {
            if (!this.Mary) {
               mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12979));
               this.Mary = true;
               "".length();
               if ("".length() >= " ".length()) {
                  return;
               }
            }
         } else if (this.Mary) {
            mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12984));
            this.Mary = false;
         }

         if (this.PaTRicia.Jack()) {
            if (shouldPlace) {
               Timer.Jack = this.ElizabetTH.George();
               "".length();
               if ("   ".length() != "   ".length()) {
                  return;
               }
            } else {
               Timer.Jack = this.JennifeR.George();
            }
         }

         if (shouldPlace) {
            ArrayList< BlockPlaceOption> canPlace = new ArrayList();
            double rnd1 = this.Patricia.method_15433((double)System.currentTimeMillis() / 1000.0D % 2.147483647E9D / 2.0D, 0.0D) / 20.0D;
            double rnd2 = this.Patricia.method_15433((double)System.currentTimeMillis() / 1000.0D % 2.147483647E9D / 2.0D, 10.0D) / 20.0D;
            double rnd3 = this.Patricia.method_15433((double)System.currentTimeMillis() / 1000.0D % 2.147483647E9D / 2.0D, 20.0D) / 20.0D;
            int y = -2;

            while(y <= 0) {
               int x = -3;

               while(x <= 3) {
                  int z = -3;

                  while(z <= 3) {
                     class_2338 pos = mc.field_1724.method_24515().method_10069(x, -1 + y, z);
                     if (BlockUtils.getState(pos).method_26207().method_15799() && b != null && lIlIIIll(b.method_17941(), 1.0D) == 0 && lIlIIIll(b.method_17940(), 1.0D) == 0 && lIlIIIll(b.method_17939(), 1.0D) == 0) {
                        class_2350[] var22 = class_2350.values();
                        int var23 = var22.length;
                        int var24 = 0;

                        while(var24 < var23) {
                           class_2350 dir = var22[var24];
                           if (dir == class_2350.field_11036 && this.MAry.Jack()) {
                              "".length();
                              if (" ".length() == 0) {
                                 return;
                              }
                           } else {
                              class_243 vPos = new class_243((double)pos.method_10263() + 0.5D, (double)pos.method_10264() + 0.5D, (double)pos.method_10260() + 0.5D);
                              if (dir.method_10148() == 0) {
                                 vPos = vPos.method_1031(rnd1, 0.0D, 0.0D);
                              }

                              if (dir.method_10164() == 0) {
                                 vPos = vPos.method_1031(0.0D, rnd2, 0.0D);
                              }

                              if (dir.method_10165() == 0) {
                                 vPos = vPos.method_1031(0.0D, 0.0D, rnd3);
                              }

                              canPlace.add(new BlockPlaceOption(vPos.method_1031((double)dir.method_10148() / 2.0D, (double)dir.method_10164() / 2.0D, (double)dir.method_10165() / 2.0D), pos, dir));
                              "".length();
                           }

                           ++var24;
                           "".length();
                           if ((131 + 114 - 232 + 139 ^ 151 + 138 - 173 + 40) <= "   ".length()) {
                              return;
                           }
                        }
                     }

                     ++z;
                     "".length();
                     if ("".length() != 0) {
                        return;
                     }
                  }

                  ++x;
                  "".length();
                  if ("   ".length() != "   ".length()) {
                     return;
                  }
               }

               ++y;
               "".length();
               if ("   ".length() <= 0) {
                  return;
               }
            }

            if (canPlace.size() > 0) {
               this.William = this.WIlliam.Oscar();
               canPlace.sort((p1, p2) -> {
                  class_243 playerPos = mc.field_1724.method_19538();
                  int var3 = (int)((p1.Oliver.method_1022(playerPos) - p2.Oliver.method_1022(playerPos)) * 10000.0D);
                  "".length();
                  return -" ".length() >= (96 ^ 100 ^ "".length()) ? "".length() : var3;
               });
               BlockPlaceOption option = ( BlockPlaceOption)canPlace.get(0);
               this.Harry = option.Jack;
               if (--this.James < this.OscarW.Oscar()) {
                  Rotation rot = RotationUtils.getNeededRotations(option.Oliver, 0.0F, 0.0F);
                  float var31 = this.George;
                  float var10002 = RotationUtils.to180(rot.getYaw() - this.George);
                  float var10003;
                  if (this.Sarah.Jack()) {
                     var10003 = 1.0F;
                     "".length();
                     if (-" ".length() > "   ".length()) {
                        return;
                     }
                  } else {
                     var10003 = this.LindA.George();
                  }

                  this.George = var31 + RotationUtils.getFixedRotation(var10002 / var10003);
                  var31 = this.Oscar;
                  var10002 = rot.getPitch() - this.Oscar;
                  if (this.Sarah.Jack()) {
                     var10003 = 1.0F;
                     "".length();
                     if ("".length() != 0) {
                        return;
                     }
                  } else {
                     var10003 = this.LindA.George();
                  }

                  this.Oscar = var31 + RotationUtils.getFixedRotation(var10002 / var10003);
                  if (lIlIIlII(Math.abs(rot.getPitch() - this.Oscar), 5.0F) <= 0 && lIlIIlII(Math.abs(RotationUtils.to180(rot.getYaw() - this.George)), 15.0F) <= 0) {
                     if (!this.Mary) {
                        mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12984));
                        this.Mary = false;
                        Global.Thomas.Harry = this.Georgee.Jack();
                     }
                  } else if (this.BarbarA.Jack()) {
                     mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12979));
                     this.Mary = true;
                     Global.Thomas.Harry = true;
                     "".length();
                     if ("".length() != 0) {
                        return;
                     }
                  }

                  if (this.Jack.Harry() == SwitchMode.Oliver && !blockSelected) {
                     mc.field_1724.method_18800(mc.field_1724.method_18798().field_1352, 0.0D, mc.field_1724.method_18798().field_1350);
                     mc.field_1724.field_3944.method_2883(new class_2868(shouldSelect));
                  }

                  if (this.James < 1 && lIlIIlIl(Math.abs(RotationUtils.to180(rot.getYaw() - this.George)), 15.0F) < 0 && lIlIIlIl(Math.abs(rot.getPitch() - this.Oscar), 5.0F) < 0) {
                     IMC.getInteractionManager().rightClickBlock(option.Jack, option.Harry, option.Oliver);
                     if (this.OlIver.Jack()) {
                        mc.field_1724.method_6104(class_1268.field_5808);
                     }

                     this.James = this.OscarW.Oscar() + ThreadLocalRandom.current().nextInt(this.JameS.Oscar() + 1);
                     if (lIlIIllI(Math.random(), (double)this.ThomaSS.George()) < 0) {
                        var10001 = true;
                        "".length();
                        if ("".length() < 0) {
                           return;
                        }
                     } else {
                        var10001 = false;
                     }

                     this.Jennifer = var10001;
                  }

                  if (this.Jack.Harry() == SwitchMode.Oliver && !blockSelected) {
                     mc.field_1724.field_3944.method_2883(new class_2868(mc.field_1724.field_7514.field_7545));
                  }
               }
            }
         }

         if (this.William-- > 0) {
            Global.George().applyWithPacket(this.George, this.Oscar);
            this.George = Global.George().getYaw();
            this.Oscar = Global.George().getPitch();
            "".length();
            if (-" ".length() > -" ".length()) {
               return;
            }
         } else {
            this.George = mc.field_1724.field_6031;
            this.Oscar = mc.field_1724.field_5965;
         }

         if (this.Jessica.Jack()) {
            event.Harry = this.George;
            double strafe = (double)Math.max(Math.abs(mc.field_1724.field_6250), Math.abs(mc.field_1724.field_6212));
            class_243 inp = event.Oliver.method_1024((float)Math.toRadians((double)((float)Math.round((event.Harry - mc.field_1773.method_19418().method_19330()) / 45.0F) * 45.0F)));
            inp = new class_243(MathUtils.clamp(-1.0D, inp.field_1352 * 100.0D, 1.0D), MathUtils.clamp(-1.0D, inp.field_1351 * 100.0D, 1.0D), MathUtils.clamp(-1.0D, inp.field_1350 * 1000.0D, 1.0D));
            event.Oliver = inp.method_1021(strafe);
         }

         this.Linda = mc.field_1724.field_7514.field_7545;
         "".length();
         if (null == null) {
            ;
         }
      }
   }

   public void Oliver(JumpBoostEvent event) {
      if (this.Jessica.Jack()) {
         event.Oliver = this.George;
      }

      "".length();
      if ("  ".length() == "  ".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1 = "Sexy";
      "".length();
      return -"  ".length() > 0 ? null : var1;
   }

   public void Jacob() {
      EVENT_MANAGER.Oliver(StrafeEventListener.class, this);
      EVENT_MANAGER.Oliver(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(Render2DListener.class, this);
      if (mc.field_1724 == null) {
         this.Jack(false);
         "".length();
         if ("   ".length() <= " ".length()) {
            return;
         }
      } else {
         this.Jacob = mc.field_1724.method_24515().method_10264();
         this.Harry = null;
         this.Jennifer = true;
         this.Elizabeth = mc.field_1724.field_7514.field_7545;
         this.Charlie = mc.field_1724.field_7514.field_7545;
         "".length();
         if ("".length() >= " ".length()) {
            return;
         }
      }

   }

   public void Oliver(float partialTicks) {
      mc.field_1690.field_1867.method_23481(this.HaRry.Jack());
      if (this.Harry != null) {
         double yaw = MovementUtils.getDirection(mc.field_1724.field_6031);
         GL11.glEnable(3042);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(2848);
         RenderUtils.setLineWidth(2.0F);
         GL11.glDisable(3553);
         class_4493.method_22076();
         GL11.glDisable(2929);
         GL11.glDisable(2896);
         GL11.glPushMatrix();
         RenderUtils.applyRenderOffset();
         GL11.glTranslated((double)this.Harry.method_10263(), (double)this.Harry.method_10264(), (double)this.Harry.method_10260());
         ThemeManager.usePrimaryColor(0.25F);
         RenderUtils.drawSolidBox();
         ThemeManager.usePrimaryColor(0.4F);
         RenderUtils.drawCrossBox();
         GL11.glPopMatrix();
         GL11.glEnable(2929);
         GL11.glEnable(3553);
         GL11.glDisable(3042);
         GL11.glDisable(2848);
      }

      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public Scaffold() {
      super("Scaffold", "Automatically places blocks beneath your feet.", Category.Jacob);
      this.Jack = new EnumSetting("Switch Method", SwitchMode.values(), SwitchMode.Jack);
      this.Jessica = new BooleanSetting("Rotation Strafe", false);
      this.Sarah = new BooleanSetting("Instant Rotation", false);
      this.OlIver = new BooleanSetting("Should Swing", true);
      this.JaCk = new BooleanSetting("Should Sneak", true);
      this.HaRry = new BooleanSetting("Should Sprint", false);
      this.JacoB = new NumberSetting("Sneak Speed", 0.42D, 0.0D, 1.0D, 0.01D);
      this.CharliE = new NumberSetting("Speed Multiplier", 1.0D, 0.0D, 1.0D, 0.01D);
      this.ThomaSS = new NumberSetting("Sneak Chance", 1.0D, 0.05D, 1.0D, 0.01D);
      this.Georgee = new BooleanSetting("SafeWalk", true);
      this.OscarW = new NumberSetting("Min Delay", 2.0D, 0.0D, 10.0D, 1.0D);
      this.JameS = new NumberSetting("Random Delay", 0.0D, 0.0D, 10.0D, 1.0D);
      this.WIlliam = new NumberSetting("Rotation Hold Time", 15.0D, 0.0D, 60.0D, 1.0D);
      this.MAry = new BooleanSetting("Same Y", false);
      this.PaTRicia = new BooleanSetting("Change Timer", false);
      this.JennifeR = new NumberSetting("Default Timer Value", 1.0D, 0.05D, 2.0D, 0.01D);
      this.ElizabetTH = new NumberSetting("Place Timer Value", 1.0D, 0.05D, 2.0D, 0.01D);
      this.LindA = new NumberSetting("Rotation Smooth Factor", 1.6D, 1.0D, 3.0D, 0.01D);
      this.BarbarA = new BooleanSetting("Safe Placer", "When the scaffold has not yet aimed, it will save you from falling", true);
      this.Harry = null;
      this.Jacob = -1;
      this.Charlie = -1;
      this.Thomas = -1;
      this.George = 0.0F;
      this.Oscar = 0.0F;
      this.James = 0;
      this.William = 0;
      this.Mary = false;
      this.Patricia = new class_3541(ThreadLocalRandom.current());
      this.Jennifer = false;
      this.Elizabeth = -1;
      this.Linda = 0;
      this.Barbara = 0;
      this.SuSAn = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.Susan = -1.5D;
      this.addSetting(new Splitter("General"));
      this.addSetting(this.Jack);
      this.addSetting(this.Jessica);
      this.addSetting(this.OlIver);
      this.addSetting(this.MAry);
      this.addSetting(this.Georgee);
      this.addSetting(new Splitter("Speed & Sneak", "The sneak in the scaffold is silent."));
      this.addSetting(this.HaRry);
      this.addSetting(this.JaCk);
      this.addSetting(this.ThomaSS);
      this.addSetting(this.JacoB);
      this.addSetting(this.CharliE);
      this.addSetting(new Splitter("Delay"));
      this.addSetting(this.OscarW);
      this.addSetting(this.JameS);
      this.addSetting(new Splitter("Rotation Settings"));
      this.addSetting(this.Sarah);
      this.addSetting(this.LindA);
      this.addSetting(this.WIlliam);
      this.addSetting(this.BarbarA);
      this.addSetting(new Splitter("Timer"));
      this.addSetting(this.PaTRicia);
      this.addSetting(this.JennifeR);
      this.addSetting(this.ElizabetTH);
      "".length();
      if (null != null) {
         throw null;
      }
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(StrafeEventListener.class, this);
      EVENT_MANAGER.Jack(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(Render2DListener.class, this);
      if (mc.field_1724 != null) {
         if (this.Mary) {
            mc.field_1724.field_3944.method_2872().method_10743(new class_2848(mc.field_1724, class_2849.field_12984));
            this.Mary = false;
         }

         mc.field_1724.field_7514.field_7545 = this.Charlie;
      }

      Global.Thomas.Harry = false;
      Timer.Jack = 1.0F;
      "".length();
      if (" ".length() > -" ".length()) {
         ;
      }
   }

   private static enum SwitchMode {
      // $FF: synthetic field
      Jack("Swith");

      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Harry("None"),
      // $FF: synthetic field
      Oliver("Silent Place");

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return null != null ? null : var1;
      }

      private SwitchMode(String name) {
         this.Jacob = name;
         "".length();
         if ((127 ^ 58 ^ 193 ^ 128) != (7 + 101 - 59 + 89 ^ 12 + 55 - 18 + 93)) {
            throw null;
         }
      }

      static {
         "".length();
         if ((123 ^ 127) >= 0) {
            ;
         }
      }
   }

   private static class BlockPlaceOption {
      // $FF: synthetic field
      final class_243 Oliver;
      // $FF: synthetic field
      final class_2350 Harry;
      // $FF: synthetic field
      final class_2338 Jack;

      static {
         "".length();
         if (-" ".length() < (119 ^ 115)) {
            ;
         }
      }

      private BlockPlaceOption(class_243 pos, class_2338 blockPos, class_2350 dir) {
         this.Oliver = pos;
         this.Jack = blockPos;
         this.Harry = dir;
         "".length();
         if (null != null) {
            throw null;
         }
      }

      // $FF: synthetic method
      BlockPlaceOption(class_243 x0, class_2338 x1, class_2350 x2, Object x3) {
         this(x0, x1, x2);
         "".length();
         if ("".length() >= " ".length()) {
            throw null;
         }
      }
   }
}
