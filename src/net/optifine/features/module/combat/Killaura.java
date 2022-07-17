package net.optifine.features.module.combat;

import net.optifine.Global;
import net.optifine.config.*;
import net.optifine.config.NumberSetting.ValueDisplay;
import net.optifine.managers.event.events.*;
import net.optifine.managers.event.events.JumpBoostEventListener.JumpBoostEvent;
import net.optifine.managers.event.events.StrafeEventListener.StrafeEvent;
import net.optifine.util.ChatUtils;
import net.optifine.util.FakePlayerEntity;
import net.optifine.util.RotationUtils;
import net.optifine.util.RotationUtils.Rotation;
import net.optifine.util.gui.Translatable;
import net.optifine.util.math.MathUtils;
import net.optifine.util.math.RandomUtil;
import net.minecraft.*;
import net.minecraft.class_2846.class_2847;
import net.optifine.features.module.Category;
import net.optifine.features.module.Module;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class Killaura extends Module implements RenderListener, JumpBoostEventListener, StrafeEventListener, UpdateListener, PreMotionListener {
   // $FF: synthetic field
   private final EnumSetting< Priority> Susan;
   // $FF: synthetic field
   private final NumberSetting LindA;
   // $FF: synthetic field
   private final BooleanSetting var9;
   // $FF: synthetic field
   double James;
   // $FF: synthetic field
   Rotation Jacob;
   // $FF: synthetic field
   double Elizabeth;
   // $FF: synthetic field
   private final NumberSetting var5;
   // $FF: synthetic field
   private final BooleanSetting SuSAn;
   // $FF: synthetic field
   public static final RotationStrafeMode[] Harry = RotationStrafeMode.values();
   // $FF: synthetic field
   private final NumberSetting MargareT;
   // $FF: synthetic field
   private final DoubleSliderSetting JessIca;
   // $FF: synthetic field
   public static final Mode[] Jack = Mode.values();
   // $FF: synthetic field
   double William;
   // $FF: synthetic field
   double Jennifer;
   // $FF: synthetic field
   private final NumberSetting JaCk;
   // $FF: synthetic field
   private final BooleanSetting var10;
   // $FF: synthetic field
   private int e;
   // $FF: synthetic field
   private final NumberSetting var1;
   // $FF: synthetic field
   private final NumberSetting JacoB;
   // $FF: synthetic field
   double Patricia;
   // $FF: synthetic field
   int Thomas;
   // $FF: synthetic field
   private class_1297 h;
   // $FF: synthetic field
   private long i;
   // $FF: synthetic field
   double Mary;
   // $FF: synthetic field
   private final NumberSetting var2;
   // $FF: synthetic field
   private final NumberSetting OlIver;
   // $FF: synthetic field
   private final BooleanSetting var6;
   // $FF: synthetic field
   private final BooleanSetting var3;
   // $FF: synthetic field
   private final BooleanSetting MAry;
   // $FF: synthetic field
   class_3541 George;
   // $FF: synthetic field
   private final BooleanSetting OscarW;
   // $FF: synthetic field
   private final EnumSetting< RotationStrafeMode> BarbarA;
   // $FF: synthetic field
   private final BooleanSetting JameS;
   // $FF: synthetic field
   private final NumberSetting var4;
   // $FF: synthetic field
   int Linda;
   // $FF: synthetic field
   public boolean Oscar;
   // $FF: synthetic field
   Rotation Charlie;
   // $FF: synthetic field
   private final BooleanSetting b;
   // $FF: synthetic field
   private int d;
   // $FF: synthetic field
   private final BooleanSetting WIlliam;
   // $FF: synthetic field
   private final BooleanSetting var8;
   // $FF: synthetic field
   private final NumberSetting ThomaSS;
   // $FF: synthetic field
   private int f;
   // $FF: synthetic field
   private boolean g;
   // $FF: synthetic field
   private final EnumSetting< PvpVersion> Barbara;
   // $FF: synthetic field
   private final BooleanSetting a;
   // $FF: synthetic field
   private final EnumSetting< Mode> ElizabetTH;
   // $FF: synthetic field
   private final NumberSetting HaRry;
   // $FF: synthetic field
   private final BooleanSetting var7;
   // $FF: synthetic field
   private final NumberSetting JennifeR;
   // $FF: synthetic field
   private final BooleanSetting Georgee;
   // $FF: synthetic field
   private final BooleanSetting PaTRicia;
   // $FF: synthetic field
   private final EnumSetting< Mode> Margaret;
   // $FF: synthetic field
   private final NumberSetting c;
   // $FF: synthetic field
   private final NumberSetting Sarah;
   // $FF: synthetic field
   private final NumberSetting SaRah;
   // $FF: synthetic field
   private final NumberSetting Jessica;
   // $FF: synthetic field
   private final BooleanSetting CharliE;

   private void Linda() {
      if (mc.field_1687 == null) {
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         AntiBot antiBot = Global.Jack().var9;
         double rangeSq = Math.pow(this.Jessica.Jack(), 2.0D);
         Stream<class_1297> stream = StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
            byte var5x = this.Oliver(e, antiBot, rangeSq);
            "".length();
            return (boolean)(-(1 ^ 5) > 0 ? "".length() : var5x);
         });
         this.h = (class_1297)stream.min( Priority.Jack(( Priority)this.Susan.Harry())).orElse((Object)null);
         "".length();
         if ((86 ^ 51 ^ 241 ^ 144) <= "".length()) {
            return;
         }
      }

   }

   private int Barbara() {
      class_1661 inv = mc.field_1724.field_7514;
      int i = 0;

      int var3x;
      while(true) {
         if (i >= 9) {
            var3x = -1;
            "".length();
            if ("  ".length() < 0) {
               return "".length();
            }
            break;
         }

         if (this.Oliver(inv.method_5438(i).method_7909())) {
            var3x = i;
            "".length();
            if ((164 ^ 150 ^ 87 ^ 97) < "  ".length()) {
               return "".length();
            }
            break;
         }

         ++i;
         "".length();
         if (-" ".length() != -" ".length()) {
            return "".length();
         }
      }

      return var3x;
   }

   private static int llIllIIII(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   protected final class_243 Oliver(float pitch, float yaw) {
      float f = pitch * 0.017453292F;
      float g = -yaw * 0.017453292F;
      float h = class_3532.method_15362(g);
      float i = class_3532.method_15374(g);
      float j = class_3532.method_15362(f);
      float k = class_3532.method_15374(f);
      class_243 var9x = new class_243((double)(i * j), (double)(-k), (double)(h * j));
      "".length();
      return -"  ".length() >= 0 ? null : var9x;
   }

   private static int llIlIlIIl(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   // $FF: synthetic method
   static class_310 Elizabeth() {
      class_310 var0 = mc;
      "".length();
      return "   ".length() != "   ".length() ? null : var0;
   }

   static {
      "".length();
      if (-" ".length() <= "  ".length()) {
         ;
      }
   }

   public String Oliver() {
      String var1x = Priority.Oliver(( Priority)this.Susan.Harry());
      "".length();
      return null != null ? null : var1x;
   }

   public boolean Patricia() {
      boolean var10000;
      if (this.CharliE.Jack() && !Global.Jack().Linda.isEnabled() && llIlIlIII(mc.field_1724.field_6017, this.ThomaSS.George()) < 0 && (!mc.field_1724.method_6128() || llIlIlIIl(mc.field_1724.method_18798().method_10214(), 0.0D) >= 0)) {
         var10000 = false;
      } else {
         var10000 = true;
         "".length();
         if ("".length() != 0) {
            return (boolean)"".length();
         }
      }

      boolean validCrit = var10000;
      if ((this.Barbara.Harry() != PvpVersion.Jack || llIlIlIII(mc.field_1724.method_7261(0.0F), this.JaCk.George()) < 0) && (this.Barbara.Harry() != PvpVersion.Oliver || llIlIlIlI(System.currentTimeMillis(), this.i) < 0)) {
         var10000 = false;
      } else {
         var10000 = true;
         "".length();
         if ("".length() > (155 ^ 159)) {
            return (boolean)"".length();
         }
      }

      boolean validCooldown = var10000;
      byte var4x;
      if (this.h == null || !Global.Jack().Q.Oliver((class_1309)this.h) && (!validCooldown || !validCrit) || !this.WIlliam.Jack() && mc.field_1755 != null) {
         var4x = 0;
      } else {
         var4x = 1;
         "".length();
         if ("".length() >= "   ".length()) {
            return (boolean)"".length();
         }
      }

      byte var3x = var4x;
      "".length();
      return (boolean)("   ".length() == 0 ? "".length() : var3x);
   }

   public EnumSetting< PvpVersion> James() {
      EnumSetting var1x = this.Barbara;
      "".length();
      return "   ".length() != "   ".length() ? null : var1x;
   }

   public double Oscar() {
      double var1x = (double)this.Sarah.George();
      "".length();
      return "   ".length() <= 0 ? 0.0D : var1x;
   }

   private static int llIllIIIl(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   private static int llIlIllII(float var0, float var1x) {
      float var2x;
      return (var2x = var0 - var1x) == 0.0F ? 0 : (var2x < 0.0F ? -1 : 1);
   }

   public void George() {
      if (Global.William != 1) {
         mc.field_1724.method_18799(mc.field_1724.method_18798().method_18805((double)Global.William, (double)Global.William, (double)Global.William));
      }

      ++this.Thomas;
      if (llIlIlIll(this.Sarah.George(), this.OlIver.George()) > 0) {
         ChatUtils.message("Hit & Swing Range parametrs are invalid, disabling!");
         this.Oliver(false);
         "".length();
         if ("".length() > 0) {
            return;
         }
      } else {
         --this.e;
         --this.d;
         class_746 player = mc.field_1724;
         if (player.method_29504()) {
            if (this.JameS.Jack()) {
               this.Oliver(false);
            }

            "".length();
            if ("  ".length() >= "   ".length()) {
               return;
            }
         } else {
            Random rand = ThreadLocalRandom.current();
            if (this.h == null) {
               "".length();
               if ("  ".length() <= " ".length()) {
                  return;
               }
            } else {
               if (this.PaTRicia.Jack() && player.field_7514.method_5438(40).method_7909() == class_1802.field_8255) {
                  class_304 var10000 = mc.field_1690.field_1904;
                  boolean var10001;
                  if (this.d <= 1) {
                     var10001 = true;
                     "".length();
                     if ("   ".length() == "".length()) {
                        return;
                     }
                  } else {
                     var10001 = false;
                  }

                  var10000.method_23481(var10001);
               }

               if (this.g && this.e == 98) {
                  if (this.PaTRicia.Jack() && player.field_7514.method_5438(40).method_7909() == class_1802.field_8255) {
                     mc.field_1690.field_1904.method_23481(false);
                     mc.field_1724.field_3944.method_2872().method_10743(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
                  }

                  player.field_3944.method_2883(new class_2824(this.h, player.method_5715()));
                  player.field_3944.method_2883(new class_2879(class_1268.field_5808));
                  this.d = 2;
               }

               if (this.g && this.e == 96) {
                  mc.field_1724.field_7514.field_7545 = this.f;
                  this.g = false;
               }

               int axe;
               if (this.MAry.Jack() && !this.g && this.h instanceof class_745 && this.e <= 0 && (axe = this.Barbara()) != -1) {
                  class_745 pl = (class_745)this.h;
                  if (pl.method_6039() && llIlIllII(180.0F - Math.abs(RotationUtils.to180(RotationUtils.getYawToVec(this.h.method_19538()) - this.h.method_5705(0.0F) % 360.0F)), 90.0F) < 0 && (pl.method_5998(class_1268.field_5808).method_7909() == class_1802.field_8255 || pl.method_5998(class_1268.field_5810).method_7909() == class_1802.field_8255)) {
                     this.f = mc.field_1724.field_7514.field_7545;
                     mc.field_1724.field_7514.field_7545 = axe;
                     this.e = 100;
                     this.g = true;
                  }
               }

               Optional<class_243> optionalPoint = this.h.method_5829().method_992(RotationUtils.getEyesPos(), RotationUtils.getEyesPos().method_1019(this.Oliver(this.William(), this.Mary()).method_1021(1000.0D)));
               boolean var27;
               if (optionalPoint.isPresent() && llIlIllIl(((class_243)optionalPoint.get()).method_1022(RotationUtils.getEyesPos()), (double)this.Jessica.George()) <= 0) {
                  var27 = true;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var27 = false;
               }

               boolean correctHitbox = var27;
               class_1297 target = this.h;
               if (this.OscarW.Jack() && correctHitbox) {
                  if (target.method_5829().method_994(mc.field_1724.method_5829())) {
                     "".length();
                     if (-"   ".length() >= 0) {
                        return;
                     }
                  } else {
                     Stream<class_1297> stream = StreamSupport.stream(mc.field_1687.method_18112().spliterator(), true).filter((e) -> {
                        byte var10000;
                        if (e != player) {
                           var10000 = 1;
                           "".length();
                           if (null != null) {
                              return (boolean)"".length();
                           }
                        } else {
                           var10000 = 0;
                        }

                        byte var2x = var10000;
                        "".length();
                        return (boolean)(-" ".length() >= "  ".length() ? "".length() : var2x);
                     }).filter((e) -> {
                        byte var10000;
                        if (llIllIIII(player.method_5858(e), (double)this.Jessica.George()) <= 0) {
                           var10000 = 1;
                           "".length();
                           if ("".length() != 0) {
                              return (boolean)"".length();
                           }
                        } else {
                           var10000 = 0;
                        }

                        byte var3x = var10000;
                        "".length();
                        return (boolean)("  ".length() < " ".length() ? "".length() : var3x);
                     });
                     Object[] var8x = stream.toArray();
                     int var9x = var8x.length;
                     int var10x = 0;

                     while(var10x < var9x) {
                        Object entity = var8x[var10x];
                        class_1297 ent = (class_1297)entity;
                        if (!(ent instanceof class_1667) && !(ent instanceof class_1686)) {
                           if (!(ent instanceof class_1542)) {
                              Optional<class_243> point = ent.method_5829().method_992(RotationUtils.getEyesPos(), RotationUtils.getEyesPos().method_1019(this.Oliver(this.William(), this.Mary()).method_1021(1000.0D)));
                              if (point.isPresent() && llIlIllIl(((class_243)point.get()).method_1022(RotationUtils.getEyesPos()), (double)this.Jessica.George()) <= 0) {
                                 target = ent;
                                 "".length();
                                 if ((136 + 107 - 125 + 31 ^ 124 + 84 - 158 + 95) > (97 ^ 12 ^ 5 ^ 108)) {
                                    return;
                                 }
                              }
                              break;
                           }

                           "".length();
                           if (-"  ".length() > 0) {
                              return;
                           }
                        }

                        ++var10x;
                        "".length();
                        if (-" ".length() == "  ".length()) {
                           return;
                        }
                     }
                  }
               }

               if (this.Patricia() && correctHitbox) {
                  if (this.PaTRicia.Jack() && player.field_7514.method_5438(40).method_7909() == class_1802.field_8255) {
                     mc.field_1690.field_1904.method_23481(false);
                     mc.field_1724.field_3944.method_2872().method_10743(new class_2846(class_2847.field_12974, class_2338.field_10980, class_2350.field_11033));
                  }

                  double osc1 = this.George.method_15433((double)System.currentTimeMillis() / 300.0D % 2.147483647E9D / 2.0D, 0.0D) * (this.JacoB.Jack() - this.HaRry.Jack());
                  double osc2 = this.George.method_15433((double)System.currentTimeMillis() / 4000.0D % 2.147483647E9D / 2.0D, 0.0D) * (this.JacoB.Jack() - this.HaRry.Jack()) / 2.0D;
                  Random random = ThreadLocalRandom.current();
                  double rnd = (MathUtils.clamp(random.nextGaussian(), -2.0D, 2.0D) / 4.0D + 0.5D) * (random.nextDouble() + 1.0D) / 2.0D;
                  double min = this.HaRry.Jack() + osc1 + osc2;
                  double max = this.JacoB.Jack() + osc1 + osc2;
                  double cps = min + rnd * (max - min);
                  long cd = (long)(1000.0D / cps);
                  this.i = System.currentTimeMillis() + cd - 50L;
                  Global.Jack().Linda.George();
                  if (llIlIllII(target.method_5739(mc.field_1724), this.Sarah.George()) < 0) {
                     if (this.Georgee.Jack()) {
                        player.field_3944.method_2883(new class_2824(target, player.method_5715()));
                        if (this.Barbara.Harry() == PvpVersion.Jack) {
                           player.method_7350();
                           "".length();
                           if (null != null) {
                              return;
                           }
                        }
                     } else {
                        mc.field_1761.method_2918(player, target);
                     }
                  }

                  if (llIlIllII(target.method_5739(mc.field_1724), this.OlIver.George()) < 0) {
                     if (this.Margaret.Harry() == Mode.Jack) {
                        player.method_6104(class_1268.field_5808);
                        "".length();
                        if ("".length() != 0) {
                           return;
                        }
                     } else if (this.Margaret.Harry() == Mode.Harry) {
                        player.field_3944.method_2883(new class_2879(class_1268.field_5808));
                     }
                  }

                  this.d = 2;
               }

               "".length();
               if (null != null) {
                  return;
               }
            }
         }
      }

   }

   public float Mary() {
      float var1x = Global.George().getYaw();
      "".length();
      return " ".length() < 0 ? 0.0F : var1x;
   }

   private float Jack(double start, float end) {
      float var4x = RandomUtil.nextFloat((float)start, end);
      "".length();
      return "   ".length() != "   ".length() ? 0.0F : var4x;
   }

   public void Oliver(float partialTicks) {
      this.Linda();
      if (this.h == null) {
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else if (this.Charlie == null) {
         "".length();
         if ("".length() != 0) {
            return;
         }
      } else {
         if (this.ElizabetTH.Harry() == Mode.Jack) {
            float pitch = (float)((double)this.Charlie.getPitch() + (double)(this.Jacob.getPitch() - this.Charlie.getPitch()) * Math.pow((double)(Global.Oliver.method_1534() / this.LindA.George()), 0.5D));
            float yaw = (float)((double)this.Charlie.getYaw() + (double)(this.Jacob.getYaw() - this.Charlie.getYaw()) * Math.pow((double)(Global.Oliver.method_1534() / this.LindA.George()), 0.5D));
            this.Charlie = new Rotation(yaw, pitch);
            Global.George().applyClient(yaw, pitch, true);
         }

         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      }

   }

   public class_1297 Jennifer() {
      class_1297 var1x = this.h;
      "".length();
      return -(31 + 30 - 51 + 181 ^ 113 + 144 - 76 + 6) >= 0 ? null : var1x;
   }

   private float Oliver(double start, float end) {
      float var10000;
      if (this.Thomas % this.MargareT.Oscar() == 0) {
         var10000 = RandomUtil.nextFloat((float)start, end);
         "".length();
         if ("".length() > " ".length()) {
            return 0.0F;
         }
      } else {
         var10000 = 0.0F;
      }

      float var4x = var10000;
      "".length();
      return "".length() != 0 ? 0.0F : var4x;
   }

   private boolean Oliver(class_1792 i) {
      byte var10000;
      if (i != class_1802.field_22025 && i != class_1802.field_8556 && i != class_1802.field_8825 && i != class_1802.field_8475 && i != class_1802.field_8062 && i != class_1802.field_8406) {
         var10000 = 0;
      } else {
         var10000 = 1;
         "".length();
         if ((61 ^ 57) <= "".length()) {
            return (boolean)"".length();
         }
      }

      byte var2x = var10000;
      "".length();
      return (boolean)(" ".length() < 0 ? "".length() : var2x);
   }

   public Killaura() {
      super("KillAura", Translatable.KILLAURA_DESC, Category.Oliver);
      this.Barbara = new EnumSetting("PvP Version", PvpVersion.values(), PvpVersion.Jack);
      this.Susan = new EnumSetting("Priority", Priority.values(), Priority.Harry);
      this.Margaret = new EnumSetting("Swing Mode", Mode.values(), Mode.Jack);
      this.Jessica = new NumberSetting("Aim Range", 4.0D, 1.0D, 7.0D, 0.01D);
      this.Sarah = new NumberSetting("Hit Range", 3.3D, 1.0D, 7.0D, 0.01D);
      this.OlIver = new NumberSetting("Swing Range", 3.3D, 1.0D, 7.0D, 0.01D);
      this.JaCk = new NumberSetting("Cool Down", "Weapon cooldown for hit", 0.8500000238418579D, 0.0D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.HaRry = new NumberSetting("Min CPS", 7.0D, 1.0D, 20.0D, 0.1D);
      this.JacoB = new NumberSetting("Max CPS", 12.0D, 1.0D, 20.0D, 0.1D);
      this.CharliE = new BooleanSetting("Only Critical", true);
      this.ThomaSS = new NumberSetting("Fall Distance", 0.10000000149011612D, 0.0D, 3.0D, 0.009999999776482582D);
      this.Georgee = new BooleanSetting("Keep Sprint", true);
      this.OscarW = new BooleanSetting("RayCast Nearest", Translatable.KILLAURA_RAYCAST, true);
      this.JameS = new BooleanSetting("Disable On Death", true);
      this.WIlliam = new BooleanSetting("Attack In Inventory", true);
      this.MAry = new BooleanSetting("Break Shield", true);
      this.PaTRicia = new BooleanSetting("Auto Shield", true);
      this.JennifeR = new NumberSetting("Max Speed", 30.0D, 1.0D, 180.0D, 0.01D, (v) -> {
         String var10000;
         if (llIllIIIl(v, 180.0D) == 0) {
            var10000 = Translatable.KILLAURA_INSTANT.getString();
            "".length();
            if (-(223 ^ 144 ^ 50 ^ 120) >= 0) {
               return null;
            }
         } else {
            var10000 = ValueDisplay.Oliver.getValueString(v);
         }

         String var2x = var10000;
         "".length();
         return (185 + 128 - 186 + 71 ^ 156 + 93 - 137 + 83) == 0 ? null : var2x;
      });
      this.ElizabetTH = new EnumSetting("Aim Mode", Jack, Mode.Harry);
      this.LindA = new NumberSetting("Client Smoothness", 20.0D, 1.0D, 50.0D, 1.0D, ValueDisplay.Jack);
      this.BarbarA = new EnumSetting("Strafe Mode", Translatable.KILLAURA_ROTATION_STRAFE, Harry, RotationStrafeMode.Oliver);
      this.SuSAn = new BooleanSetting("Inside Box", Translatable.KILLAURA_HITBOX, false);
      this.MargareT = new NumberSetting("Random Ticks", Translatable.KILLAURA_RANDOM_TICK, 2.0D, 1.0D, 15.0D, 1.0D, ValueDisplay.Jack);
      this.JessIca = new DoubleSliderSetting("Body Pitch & Yaw Pos", Translatable.KILLAURA_AIM_POSITION, 0.5D, 0.5D, true);
      this.SaRah = new NumberSetting("Basic Random For Yaw", Translatable.KILLAURA_RANDOM_YAW_VAL, 3.0D, 0.0D, 20.0D, 0.01D, ValueDisplay.Oliver);
      this.var1 = new NumberSetting("Basic Random For Pitch", Translatable.KILLAURA_RANDOM_PITCH_VAL, 3.0D, 0.0D, 20.0D, 0.01D, ValueDisplay.Oliver);
      this.var2 = new NumberSetting("Body Random Ticks", Translatable.KILLAURA_RANDOM_RESELECT_TICK, 2.0D, 1.0D, 15.0D, 1.0D, ValueDisplay.Jack);
      this.var3 = new BooleanSetting("Interpolate Between Body Positions", true);
      this.var4 = new NumberSetting("Body Pitch Random Rate", "Random for the body position by pitch.\n§c! Do not change anything if you dont understand how it works ! ", 0.1D, 0.0D, 1.0D, 0.01D, ValueDisplay.Oliver);
      this.var5 = new NumberSetting("Body Yaw Random Rate", "Random for the body position by yaw.\n§c! Do not change anything if you dont understand how it works ! ", 0.05D, 0.0D, 0.5D, 0.01D, ValueDisplay.Oliver);
      this.var6 = new BooleanSetting("Attack Players", true);
      this.var7 = new BooleanSetting("Attack Monsters", false);
      this.var8 = new BooleanSetting("Attack Animals", false);
      this.var9 = new BooleanSetting("Attack Pets", false);
      this.var10 = new BooleanSetting("Attack Invisible", false);
      this.a = new BooleanSetting("Attack Dead", false);
      this.b = new BooleanSetting("Box Ignore", "KillAura can update next rotation outside the hitbox\n§c! Do not change anything if you dont understand how it works ! ", false);
      this.c = new NumberSetting("Predict Height", "Randomization for the delta yaw value.\n§c! Do not change anything if you dont understand how it works ! ", 3.0D, 0.0D, 20.0D, 0.01D, ValueDisplay.Oliver);
      this.Thomas = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = false;
      this.George = new class_3541(ThreadLocalRandom.current());
      this.Oscar = false;
      this.James = 0.0D;
      this.William = 0.0D;
      this.Mary = 0.0D;
      this.Patricia = 0.0D;
      this.Jennifer = 0.0D;
      this.Elizabeth = 0.0D;
      this.Linda = 0;
      this.addSetting(new Splitter("General", "Next values are needed to setup\nvery useful things like pvp version, priorities etc."));
      this.addSetting(this.Barbara);
      this.addSetting(this.Margaret);
      this.addSetting(this.Susan);
      this.addSetting(new Splitter("Range Settings", "Next values are needed to setup\ndefault range values for killaura"));
      this.addSetting(this.Jessica);
      this.addSetting(this.Sarah);
      this.addSetting(this.OlIver);
      this.addSetting(new Splitter("Cooldown Settings", "Next values are needed to setup\nclick per second for killaura on 1.8 version"));
      this.addSetting(this.JaCk);
      this.addSetting(this.JacoB);
      this.addSetting(this.HaRry);
      this.addSetting(new Splitter("Other", "Next values are needed to setup\nvery common things like sprinting, shield, inventory etc."));
      this.addSetting(this.CharliE);
      this.addSetting(this.ThomaSS);
      this.addSetting(this.Georgee);
      this.addSetting(this.OscarW);
      this.addSetting(this.JameS);
      this.addSetting(this.WIlliam);
      this.addSetting(this.MAry);
      this.addSetting(this.PaTRicia);
      this.addSetting(new Splitter("Aim Settings", "Next values are needed to setup\naim behavior for killaura"));
      this.addSetting(this.ElizabetTH);
      this.addSetting(this.BarbarA);
      this.addSetting(this.JennifeR);
      this.addSetting(this.LindA);
      this.addSetting(this.SuSAn);
      this.addSetting(this.MargareT);
      this.addSetting(this.JessIca);
      this.addSetting(this.SaRah);
      this.addSetting(this.var1);
      this.addSetting(this.var2);
      this.addSetting(this.var3);
      this.addSetting(this.var4);
      this.addSetting(this.var5);
      this.addSetting(new Splitter("Targets", "With next settings you can choose your killaura victims."));
      this.addSetting(this.var6);
      this.addSetting(this.var7);
      this.addSetting(this.var8);
      this.addSetting(this.var9);
      this.addSetting(this.var10);
      this.addSetting(this.a);
      "".length();
      if ((237 ^ 187 ^ 149 ^ 199) == 0) {
         throw null;
      }
   }

   private static int llIlIllll(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   public void Oliver(JumpBoostEvent event) {
      RotationStrafeMode mode = ( RotationStrafeMode)this.BarbarA.Harry();
      if (mode == RotationStrafeMode.Oliver) {
         "".length();
         if ((238 ^ 189 ^ 59 ^ 109) <= 0) {
            return;
         }
      } else {
         if (mode != RotationStrafeMode.Charlie && mode != RotationStrafeMode.Jacob) {
            event.Oliver = Global.George().getStrafeYaw();
         } else {
            event.Oliver = Global.George().getStrafeYaw() + (float)(Math.round((event.Oliver - mc.field_1773.method_19418().method_19330()) / 90.0F) * 90);
            "".length();
            if (null != null) {
               return;
            }
         }

         "".length();
         if (" ".length() > " ".length()) {
            return;
         }
      }

   }

   public float William() {
      float var1x = Global.George().getPitch();
      "".length();
      return "  ".length() <= "".length() ? 0.0F : var1x;
   }

   private static int llIlIlIll(float var0, float var1x) {
      float var2x;
      return (var2x = var0 - var1x) == 0.0F ? 0 : (var2x < 0.0F ? -1 : 1);
   }

   private static int llIlIlllI(float var0, float var1x) {
      float var2x;
      return (var2x = var0 - var1x) == 0.0F ? 0 : (var2x < 0.0F ? -1 : 1);
   }

   public void Thomas() {
      this.Linda();
      if (this.h == null) {
         "".length();
         if (-" ".length() >= (40 + 71 - 56 + 78 ^ 127 + 121 - 188 + 69)) {
            return;
         }
      } else {
         Rotation rot = this.Susan();
         this.Jacob = rot;
         Global.George().applyWithPacket(rot.getYaw(), rot.getPitch(), true);
         "".length();
         if (-" ".length() >= "   ".length()) {
            return;
         }
      }

   }

   private static int llIlIIllI(float var0, float var1x) {
      float var2x;
      return (var2x = var0 - var1x) == 0.0F ? 0 : (var2x < 0.0F ? -1 : 1);
   }

   private static int llIlIlIlI(long var0, long var2x) {
      long var4x;
      return (var4x = var0 - var2x) == 0L ? 0 : (var4x < 0L ? -1 : 1);
   }

   private static int llIlIIlll(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   public void Charlie() {
      EVENT_MANAGER.Jack(PreMotionListener.class, this);
      EVENT_MANAGER.Jack(RenderListener.class, this);
      EVENT_MANAGER.Jack(StrafeEventListener.class, this);
      EVENT_MANAGER.Jack(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Jack(UpdateListener.class, this);
      this.h = null;
      mc.field_1690.field_1904.method_23481(false);
      "".length();
      if ("   ".length() != "".length()) {
         ;
      }
   }

   private static int llIlIllIl(double var0, double var2x) {
      double var4x;
      return (var4x = var0 - var2x) == 0.0D ? 0 : (var4x < 0.0D ? -1 : 1);
   }

   private boolean Oliver(class_1297 e, AntiBot ab, double rangeSq) {
      byte var10000;
      if (e == null || e.field_5988 || !(e instanceof class_1309) || llIlIIllI(((class_1309)e).method_6032(), 0.0F) <= 0 && !this.a.Jack() || llIlIIlll(mc.field_1724.method_5858(e), rangeSq) > 0 || e == mc.field_1724 || e instanceof FakePlayerEntity || Global.Oscar().contains(e.method_5820()) || Global.Jack().j.isEnabled() && mc.field_1724.method_5722(e) || !this.var10.Jack() && e.method_5767() || (!this.var6.Jack() || !(e instanceof class_1657)) && (!this.var7.Jack() || !(e instanceof class_1569)) && (!this.var8.Jack() || !(e instanceof class_1429) && !(e instanceof class_1421) && !(e instanceof class_1480) || !this.var9.Jack() && (e instanceof class_1321 && ((class_1321)e).method_6181() || e instanceof class_1496 && ((class_1496)e).method_6727())) || ab.isEnabled() && ab.Oliver(e)) {
         var10000 = 0;
      } else {
         var10000 = 1;
         "".length();
         if (null != null) {
            return (boolean)"".length();
         }
      }

      byte var5x = var10000;
      "".length();
      return (boolean)("  ".length() < 0 ? "".length() : var5x);
   }

   protected void Jacob() {
      EVENT_MANAGER.Oliver(PreMotionListener.class, this);
      EVENT_MANAGER.Oliver(RenderListener.class, this);
      EVENT_MANAGER.Oliver(StrafeEventListener.class, this);
      EVENT_MANAGER.Oliver(JumpBoostEventListener.class, this);
      EVENT_MANAGER.Oliver(UpdateListener.class, this);
      this.e = 0;
      this.d = 0;
      if (mc.field_1724 == null) {
         "".length();
         if ("   ".length() == "  ".length()) {
            return;
         }
      } else {
         this.Jacob = new Rotation(mc.field_1724.method_5705(1.0F), mc.field_1724.method_5695(1.0F));
         this.Charlie = new Rotation(mc.field_1724.method_5705(1.0F), mc.field_1724.method_5695(1.0F));
         "".length();
         if (-" ".length() >= "  ".length()) {
            return;
         }
      }

   }

   private static int llIlIlIII(float var0, float var1x) {
      float var2x;
      return (var2x = var0 - var1x) == 0.0F ? 0 : (var2x < 0.0F ? -1 : 1);
   }

   private Rotation Susan() {
      Rotation var22;
      if (mc.field_1724 == null) {
         var22 = null;
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         if (llIlIlllI((float)(this.Linda++) % this.var2.George(), 0.0F) == 0) {
            this.James = (double)this.Jack((double)(-this.var4.George()), this.var4.George());
            this.William = (double)this.Jack((double)(-this.var5.George()), this.var5.George());
            this.Mary = (double)this.Jack((double)(-this.var5.George()), this.var5.George());
            if (llIlIllll(this.Jennifer, 0.0D) == 0) {
               this.Jennifer = this.William;
               this.Patricia = this.James;
               this.Elizabeth = this.Mary;
            }
         }

         if (this.var3.Jack()) {
            this.Jennifer += (this.William - this.Jennifer) * (double)(2.0F / this.var2.George());
            this.Patricia += (this.James - this.Patricia) * (double)(2.0F / this.var2.George());
            this.Elizabeth += (this.Mary - this.Elizabeth) * (double)(2.0F / this.var2.George());
            "".length();
            if (null != null) {
               return null;
            }
         } else {
            this.Jennifer = this.William;
            this.Patricia = this.James;
            this.Elizabeth = this.Mary;
         }

         double yawPos = (1.0D - this.JessIca.Oscar()) * 0.6D - 0.3D;
         double x = yawPos + this.Jennifer;
         double z = yawPos + this.Elizabeth;
         x = MathUtils.clamp(-0.3D, x, 0.3D);
         z = MathUtils.clamp(-0.3D, z, 0.3D);
         double diffX = this.h.method_23317() - mc.field_1724.method_23317() + x;
         double diffZ = this.h.method_23321() - mc.field_1724.method_23321() + z;
         double diffY = this.h.method_23318() - mc.field_1724.method_23318() - (double)mc.field_1724.method_18381(mc.field_1724.method_18376());
         boolean var10000;
         if (this.SuSAn.Jack() && this.h.method_5829().method_994(mc.field_1724.method_5829().method_1014(0.1D))) {
            var10000 = true;
            "".length();
            if ((1 ^ 5) < (135 ^ 131)) {
               return null;
            }
         } else {
            var10000 = false;
         }

         boolean shouldIgnorePitch = var10000;
         double var23 = this.h.method_5829().method_17940();
         double var10002;
         if (shouldIgnorePitch) {
            var10002 = 0.925D;
            "".length();
            if (null != null) {
               return null;
            }
         } else {
            var10002 = this.JessIca.James();
         }

         double offset = var23 * (1.0D - var10002) - this.Patricia;
         diffY -= offset;
         diffY += Math.min(Math.max(-diffY, this.h.method_5829().method_17940() / 10.0D + offset), this.h.method_5829().method_17940() - this.h.method_5829().method_17940() / 10.0D);
         double dist = Math.sqrt(diffX * diffX + diffZ * diffZ);
         float yaw = (float)(Math.atan2(diffZ, diffX) * 180.0D / 3.141592653589793D - 90.0D);
         float pitch = (float)(-(Math.atan2(diffY, dist) * 180.0D / 3.141592653589793D));
         if (this.Jacob == null) {
            this.Jacob = new Rotation(mc.field_1724.field_6031, mc.field_1724.field_5965);
         }

         float deltaYaw = RotationUtils.getFixedRotation(MathUtils.clamp(-this.JennifeR.George(), RotationUtils.to180(yaw - this.Jacob.getYaw()), this.JennifeR.George()) + this.Oliver((double)(-this.SaRah.George()), this.SaRah.George()));
         float deltaPitch = RotationUtils.getFixedRotation(MathUtils.clamp(-this.JennifeR.George(), pitch - this.Jacob.getPitch(), this.JennifeR.George()) + this.Oliver((double)(-this.var1.George()), this.var1.George()));
         var22 = new Rotation(this.Jacob.getYaw() + deltaYaw, this.Jacob.getPitch() + deltaPitch);
         "".length();
         if ("   ".length() > (67 + 29 - -72 + 11 ^ 165 + 154 - 221 + 85)) {
            return null;
         }
      }

      return var22;
   }

   public void Oliver(StrafeEvent event) {
      class_746 player = mc.field_1724;
      RotationStrafeMode mode = ( RotationStrafeMode)this.BarbarA.Harry();
      if (mode != RotationStrafeMode.Oliver && (mode != RotationStrafeMode.Harry && mode != RotationStrafeMode.Charlie || player.method_24828())) {
         event.Harry = Global.George().getStrafeYaw();
         if (mode == RotationStrafeMode.Charlie || mode == RotationStrafeMode.Jacob) {
            event.Oliver = event.Oliver.method_1024((float)Math.toRadians((double)(Math.round((event.Harry - mc.field_1773.method_19418().method_19330()) / 90.0F) * 90)));
         }

         "".length();
         if ((139 ^ 143) < 0) {
            return;
         }
      } else {
         "".length();
         if ("".length() == "  ".length()) {
            return;
         }
      }

   }

   private static enum Mode {
      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Harry("Packet"),
      // $FF: synthetic field
      Oliver("None"),
      // $FF: synthetic field
      Jack("Client");

      private Mode(String name) {
         this.Jacob = name;
         "".length();
         if (" ".length() == "".length()) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return -(115 ^ 118) >= 0 ? null : var1;
      }

      static {
         "".length();
         if (-"   ".length() <= 0) {
            ;
         }
      }
   }

   public static enum PvpVersion {
      // $FF: synthetic field
      Oliver("1.8"),
      // $FF: synthetic field
      Jack("1.9+");

      // $FF: synthetic field
      private final String Harry;

      private PvpVersion(String name) {
         this.Harry = name;
         "".length();
         if ("".length() != 0) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Harry;
         "".length();
         return "  ".length() < " ".length() ? null : var1;
      }

      static {
         "".length();
         if (-" ".length() < 0) {
            ;
         }
      }
   }

   private static enum Priority {
      // $FF: synthetic field
      private final Comparator<class_1297> Charlie;
      // $FF: synthetic field
      Oliver("Distance", (e) -> {
         double var1;
         if (e == null) {
            var1 = 2.147483647E9D;
            "".length();
            if (" ".length() == 0) {
               return 0.0D;
            }
         } else {
            var1 = Killaura.Elizabeth().field_1724.method_5858(e);
            "".length();
            if (" ".length() < 0) {
               return 0.0D;
            }
         }

         return var1;
      });

      // $FF: synthetic field
      private final String Jacob;
      // $FF: synthetic field
      Jack("Angle", (e) -> {
         double var1;
         if (e == null) {
            var1 = 2.147483647E9D;
            "".length();
            if ("".length() != 0) {
               return 0.0D;
            }
         } else {
            var1 = RotationUtils.getAngleToLookVec(e.method_5829().method_1005());
            "".length();
            if ((159 ^ 154) == 0) {
               return 0.0D;
            }
         }

         return var1;
      }),
      // $FF: synthetic field
      Harry("Health", (e) -> {
         double var10000;
         if (e instanceof class_1309) {
            var10000 = (double)((class_1309)e).method_6032();
            "".length();
            if (-" ".length() > " ".length()) {
               return 0.0D;
            }
         } else {
            var10000 = 2.147483647E9D;
         }

         double var1 = var10000;
         "".length();
         return "".length() > 0 ? 0.0D : var1;
      });

      // $FF: synthetic method
      static Comparator Jack( Priority x0) {
         Comparator var1 = x0.Charlie;
         "".length();
         return null != null ? null : var1;
      }

      // $FF: synthetic method
      static String Oliver( Priority x0) {
         String var1 = x0.Jacob;
         "".length();
         return (72 ^ 76) == 0 ? null : var1;
      }

      static {
         "".length();
         if ("  ".length() > 0) {
            ;
         }
      }

      private Priority(String name, ToDoubleFunction<class_1297> keyExtractor) {
         this.Jacob = name;
         this.Charlie = Comparator.comparingDouble(keyExtractor);
         "".length();
         if (-" ".length() >= (38 ^ 34)) {
            throw null;
         }
      }

      public String toString() {
         String var1 = this.Jacob;
         "".length();
         return "   ".length() == -" ".length() ? null : var1;
      }
   }

   private static enum RotationStrafeMode {
      // $FF: synthetic field
      Harry("Ground"),
      // $FF: synthetic field
      Charlie("Ground-F");

      // $FF: synthetic field
      private final String Thomas;
      // $FF: synthetic field
      Jacob("Always-F"),
      // $FF: synthetic field
      Jack("Always"),
      // $FF: synthetic field
      Oliver("None");

      public String toString() {
         String var1 = this.Thomas;
         "".length();
         return -" ".length() >= 0 ? null : var1;
      }

      private RotationStrafeMode(String name) {
         this.Thomas = name;
         "".length();
         if (" ".length() <= 0) {
            throw null;
         }
      }

      static {
         "".length();
         if ("   ".length() > 0) {
            ;
         }
      }
   }
}
