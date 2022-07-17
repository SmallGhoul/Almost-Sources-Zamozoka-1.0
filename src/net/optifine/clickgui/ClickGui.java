package net.optifine.clickgui;

import com.sun.javafx.geom.CubicCurve2D;
import net.minecraft.*;
import net.optifine.clickgui.components.category.FeatureButton;
import net.optifine.clickgui.screens.ClickGuiScreen;
import net.optifine.clickgui.window.AbstractWindow;
import net.optifine.clickgui.window.CategoryWindow;
import net.optifine.clickgui.window.SettingsWindow;
import net.optifine.features.module.Category;
import net.optifine.features.module.hud.ClickGuiModule;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class ClickGui {
   // $FF: synthetic field
   public final ArrayList< MiniMenu > Harry = new ArrayList();
   // $FF: synthetic field
   private static final class_310 Thomas;
   // $FF: synthetic field
   private double Patricia = -1.5D;
   // $FF: synthetic field
   private double Mary = -1.5D;
   // $FF: synthetic field
   private boolean James;
   // $FF: synthetic field
   private double William = -1.5D;
   // $FF: synthetic field
   ClickGuiScreen Charlie;
   // $FF: synthetic field
   private String Oscar = "";
   // $FF: synthetic field
   public final ArrayList<CategoryWindow> Oliver = new ArrayList();
   // $FF: synthetic field
   public boolean Jacob = false;
   // $FF: synthetic field
   private boolean Jennifer = false;
   // $FF: synthetic field
   private final CubicCurve2D George = new CubicCurve2D(0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   // $FF: synthetic field
   public final ArrayList<SettingsWindow> Jack = new ArrayList();

   private void Jack(int mouseX, int mouseY, int mouseButton) {
      double windowStartX;
      if (Global.Thomas.Jack.Harry) {
         double windowHeight = (double)Global.Oliver.method_22683().method_4502();
         windowStartX = (double)Global.Oliver.method_22683().method_4486();
         String text = "Config is private.";
         String text2 = "You can reset the config to change settings";
         TTFFontRenderer font = Global.Harry.getGeneric();
         double x1 = windowStartX / 2.0D - (double)font.getWidth(text2) / 1.9D;
         double y1 = windowHeight - 11.0D - (double)font.getHeight(text) - (double)font.getHeight(text2);
         double x2 = windowStartX / 2.0D + (double)font.getWidth(text2) / 1.9D;
         double y2 = windowHeight - 10.0D;
         boolean var10000;
         if (lIlIlIlIlI(x1, (double)mouseX) < 0 && lIlIlIlIlI((double)mouseX, x2) < 0 && lIlIlIlIlI(y1, (double)mouseY) < 0 && lIlIlIlIlI((double)mouseY, y2) < 0) {
            var10000 = true;
            "".length();
         } else {
            var10000 = false;
         }

         boolean isHovered = var10000;
         if (isHovered) {
            Global.Thomas.Jack.Oliver(Global.Thomas.Jack.Harry());
            Global.Thomas.Jack.Oliver();
         }
      }

      int i = this.Jack.size() - 1;

      double windowEndY;
      double titleEnd;
      double cMouseX;
      double cMouseY;
      double windowStartY;
      double windowEndX;
      while(i >= 0) {
         SettingsWindow window = (SettingsWindow)this.Jack.get(i);
         windowStartX = window.Jack();
         windowStartY = window.Harry();
         windowEndX = windowStartX + window.Jacob();
         windowEndY = windowStartY + window.Charlie();
         titleEnd = windowStartY + 25.0D;
         if (lIlIlIlIlI((double)mouseX, windowStartX) >= 0) {
            if (lIlIlIlIlI((double)mouseY, windowStartY) < 0) {
               "".length();
            } else if (lIlIlIlIll((double)mouseX, windowEndX) < 0) {
               if (lIlIlIlIll((double)mouseY, windowEndY) < 0) {
                  if (lIlIlIlIlI((double)mouseY, titleEnd) < 0) {
                     window.Susan();
                     "".length();
                  } else {
                     window.George();
                     cMouseX = (double)mouseX - windowStartX;
                     cMouseY = (double)mouseY - titleEnd;
                     if (window.Elizabeth()) {
                        cMouseY -= window.Patricia();
                     }

                     this.Oliver(window, cMouseX, cMouseY, mouseButton);
                     "".length();
                     if ((108 ^ 104) <= 0) {
                        return;
                     }
                  }
                  break;
               }

               "".length();
               if ("  ".length() == 0) {
                  return;
               }
            }
         }

         --i;
         "".length();
         if (("  ".length() ^ 89 ^ 95) <= 0) {
            return;
         }
      }

      i = this.Oliver.size() - 1;

      while(i >= 0) {
         CategoryWindow window = (CategoryWindow)this.Oliver.get(i);
         windowStartX = window.Jack();
         windowStartY = window.Harry();
         windowEndX = windowStartX + window.Jacob();
         windowEndY = windowStartY + window.Charlie();
         titleEnd = windowStartY + 25.0D;
         if (lIlIlIlIlI((double)mouseX, windowStartX) >= 0) {
            if (lIlIlIlIlI((double)mouseY, windowStartY) < 0) {
               "".length();
               if ("".length() != 0) {
                  return;
               }
            } else if (lIlIlIlIll((double)mouseX, windowEndX) < 0) {
               if (lIlIlIlIll((double)mouseY, windowEndY) >= 0) {
                  "".length();
                  if (-" ".length() < -" ".length()) {
                     return;
                  }
               } else {
                  if (lIlIlIlIlI((double)mouseY, titleEnd) < 0) {
                     boolean var10001;
                     if (!window.Margaret()) {
                        var10001 = true;
                        "".length();
                        if ((81 ^ 84) == 0) {
                           return;
                        }
                     } else {
                        var10001 = false;
                     }

                     window.Oliver(var10001);
                     if (window.Margaret()) {
                        this.Oliver(window.George);
                        "".length();
                        if ((193 ^ 196) == 0) {
                           return;
                        }
                     } else {
                        Iterator var24 = this.Oliver.iterator();

                        while(var24.hasNext()) {
                           CategoryWindow category = (CategoryWindow)var24.next();
                           if (category != window) {
                              category.Oliver(true);
                              this.Oliver(category.George);
                           }

                           "".length();
                           if ("  ".length() == 0) {
                              return;
                           }
                        }

                        "".length();
                        if (-" ".length() == "   ".length()) {
                           return;
                        }
                     }
                     break;
                  }

                  if (!window.Margaret()) {
                     window.George();
                     cMouseX = (double)mouseX - windowStartX;
                     cMouseY = (double)mouseY - titleEnd;
                     if (window.Elizabeth()) {
                        cMouseY -= window.Patricia();
                     }

                     this.Oliver(window, cMouseX, cMouseY, mouseButton);
                     "".length();
                     if (-" ".length() > "   ".length()) {
                        return;
                     }
                     break;
                  }
               }
            }
         }

         --i;
         "".length();
         if ("".length() > " ".length()) {
            return;
         }
      }

      "".length();
      if (-(118 ^ 115) < 0) {
         ;
      }
   }

   private void Oliver(AbstractWindow window, double mouseX, double mouseY, int mouseButton) {
      int i2 = window.James() - 1;

      while(i2 >= 0) {
         PartOfGUI c = window.Oliver(i2);
         if (lIlIlIllII(mouseX, c.Jack()) >= 0) {
            if (lIlIlIllII(mouseY, c.Harry()) < 0) {
               "".length();
               if (-" ".length() > 0) {
                  return;
               }
            } else if (lIlIlIllIl(mouseX, c.Jack() + c.Jacob()) < 0) {
               if (lIlIlIllIl(mouseY, c.Harry() + c.Charlie()) < 0) {
                  c.Oliver(mouseX, mouseY, mouseButton);
                  "".length();
                  if (" ".length() < "".length()) {
                     return;
                  }
                  break;
               }

               "".length();
               if (-" ".length() > (100 ^ 56 ^ 22 ^ 78)) {
                  return;
               }
            }
         }

         --i2;
         "".length();
         if (" ".length() <= 0) {
            return;
         }
      }

      "".length();
      if ("  ".length() != 0) {
         ;
      }
   }

   private static int lIlIlIIIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(ClickGuiScreen clickGuiScreen) {
      this.Charlie = clickGuiScreen;
      Iterator var2 = this.Oliver.iterator();

      do {
         if (!var2.hasNext()) {
            var2 = this.Jack.iterator();

            do {
               if (!var2.hasNext()) {
                  this.Jennifer = false;
                  "".length();
                  if ((136 ^ 140) < "  ".length()) {
                     return;
                  }

                  return;
               }

               SettingsWindow window = (SettingsWindow)var2.next();
               window.Oliver(-window.Jacob());
               "".length();
            } while(-" ".length() < "  ".length());

            return;
         }

         CategoryWindow window = (CategoryWindow)var2.next();
         window.Oliver(-window.Jacob());
         "".length();
      } while(-" ".length() < 0);

   }

   public void Jack() {
      this.Jennifer = true;
      "".length();
      if ("".length() == 0) {
         ;
      }
   }

   public void Oliver(SettingsWindow window) {
      Iterator var2 = this.Jack.iterator();

      do {
         if (!var2.hasNext()) {
            this.Jack.add(window);
            "".length();
            "".length();
            if ("  ".length() == 0) {
               return;
            }

            return;
         }

         SettingsWindow setting = (SettingsWindow)var2.next();
         setting.Susan();
         "".length();
      } while("  ".length() > " ".length());

   }

   private void Oliver(class_4587 matrixStack, AbstractWindow window, int mouseX, int mouseY, float partialTicks) {
      window.Oliver(matrixStack, mouseX, mouseY, partialTicks);
      "".length();
      if ("".length() <= "".length()) {
         ;
      }
   }

   private boolean Oliver(AbstractWindow window, double mouseX, double mouseY, double dWheel) {
      boolean var9;
      if (!window.Elizabeth()) {
         var9 = true;
         "".length();
         if (-"  ".length() >= 0) {
            return (boolean)"".length();
         }
      } else if (lIlIlIIllI(mouseX, window.Jack()) >= 0 && lIlIlIIllI(mouseY, window.Harry() + 25.0D) >= 0) {
         if (lIlIlIIlll(mouseX, window.Jack() + window.Jacob()) < 0 && lIlIlIIlll(mouseY, window.Harry() + window.Charlie()) < 0) {
            double scroll = window.Patricia() + dWheel;
            window.Thomas(scroll);
            window.George(window.Jennifer() + dWheel / 2.0D);
            var9 = false;
            "".length();
            if (null != null) {
               return (boolean)"".length();
            }
         } else {
            var9 = true;
            "".length();
            if ("  ".length() < "  ".length()) {
               return (boolean)"".length();
            }
         }
      } else {
         var9 = true;
         "".length();
         if ("".length() >= ("   ".length() ^ 74 ^ 77)) {
            return (boolean)"".length();
         }
      }

      return var9;
   }

   static {
      Thomas = Global.Oliver;
      "".length();
      if (null == null) {
         ;
      }
   }

   private static int lIlIlIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(double mouseX, double mouseY, int mouseButton) {
      if (mouseButton == 0) {
         this.James = false;
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver( MiniMenu miniMenu ) {
      Iterator var2 = this.Harry.iterator();

      do {
         if (!var2.hasNext()) {
            this.Harry.add( miniMenu );
            "".length();
            "".length();
            if ("".length() < "".length()) {
               return;
            }

            return;
         }

         MiniMenu p = ( MiniMenu )var2.next();
         p.James();
         "".length();
      } while("".length() != " ".length());

   }

   private static int lIlIlIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(double mouseX, double mouseY, double delta) {
      double dWheel = delta * 4.0D;
      if (lIlIlIIlIl(dWheel, 0.0D) == 0) {
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      } else {
         int i = this.Oliver.size() - 1;

         while(i >= 0) {
            CategoryWindow window = (CategoryWindow)this.Oliver.get(i);
            if (!this.Oliver(window, mouseX, mouseY, dWheel)) {
               break;
            }

            "".length();
            if ((6 ^ 2) < 0) {
               return;
            }

            --i;
            "".length();
            if ("  ".length() != "  ".length()) {
               return;
            }
         }

         i = this.Jack.size() - 1;

         while(i >= 0) {
            SettingsWindow window = (SettingsWindow)this.Jack.get(i);
            if (!this.Oliver(window, mouseX, mouseY, dWheel)) {
               break;
            }

            "".length();
            if (" ".length() >= "   ".length()) {
               return;
            }

            --i;
            "".length();
            if ("".length() != 0) {
               return;
            }
         }

         "".length();
         if ("".length() != 0) {
            return;
         }
      }

   }

   private static int lIlIlIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void Oliver(Category closed) {
      Iterator var2 = this.Jack.iterator();

      do {
         if (!var2.hasNext()) {
            "".length();
            if (" ".length() == -" ".length()) {
               return;
            }

            return;
         }

         SettingsWindow setting = (SettingsWindow)var2.next();
         if (setting.Thomas == closed) {
            setting.Susan();
         }

         "".length();
      } while("".length() >= -" ".length());

   }

   private static int lIlIlIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean Jack(double mouseX, double mouseY, int mouseButton) {
      int i = this.Harry.size() - 1;

      boolean var24;
      while(true) {
         if (i < 0) {
            var24 = false;
            "".length();
            if (" ".length() != " ".length()) {
               return (boolean)"".length();
            }
            break;
         }

         MiniMenu miniMenu = ( MiniMenu )this.Harry.get(i);
         if ( miniMenu.Oscar()) {
            "".length();
            if (null != null) {
               return (boolean)"".length();
            }
         } else {
            PartOfGUI owner = miniMenu.Harry();
            AbstractWindow parent = owner.Thomas();
            double x0 = parent.Jack() + owner.Jack();
            double y0 = parent.Harry() + 25.0D + parent.Patricia() + owner.Harry();
            double x1 = x0 + miniMenu.Jacob();
            double y1 = y0 + miniMenu.Charlie();
            double x2 = x1 + miniMenu.Thomas();
            double y2 = y1 + miniMenu.George();
            if (lIlIlIlIII(mouseX, x1) >= 0) {
               if (lIlIlIlIII(mouseY, y1) < 0) {
                  "".length();
                  if ("   ".length() < 0) {
                     return (boolean)"".length();
                  }
               } else if (lIlIlIlIIl(mouseX, x2) < 0) {
                  if (lIlIlIlIIl(mouseY, y2) < 0) {
                     int cMouseX = (int)(mouseX - x0);
                     int cMouseY = (int)(mouseY - y0);
                     miniMenu.Oliver(cMouseX, cMouseY, mouseButton);
                     this.Harry.remove(i);
                     "".length();
                     this.Harry.add( miniMenu );
                     "".length();
                     var24 = true;
                     "".length();
                     if (-" ".length() > " ".length()) {
                        return (boolean)"".length();
                     }
                     break;
                  }

                  "".length();
                  if ("  ".length() <= 0) {
                     return (boolean)"".length();
                  }
               }
            }
         }

         --i;
         "".length();
         if (" ".length() > (44 ^ 61 ^ 60 ^ 41)) {
            return (boolean)"".length();
         }
      }

      return var24;
   }

   public boolean Harry() {
      byte var1 = this.James;
      "".length();
      return (boolean)(-(1 + 69 - -39 + 31 ^ 40 + 45 - 2 + 54) >= 0 ? "".length() : var1);
   }

   public void Oliver(class_4587 matrixStack, int mouseX, int mouseY) {
      Iterator var4 = this.Harry.iterator();

      while(var4.hasNext()) {
         MiniMenu miniMenu = ( MiniMenu )var4.next();
         PartOfGUI owner = miniMenu.Harry();
         AbstractWindow parent = owner.Thomas();
         double x1 = parent.Jack() + owner.Jack();
         double y1 = parent.Harry() + 25.0D + parent.Patricia() + owner.Harry();
         GL11.glPushMatrix();
         GL11.glTranslated(x1, y1, 300.0D);
         double cMouseX = (double)mouseX - x1;
         double cMouseY = (double)mouseY - y1;
         miniMenu.Oliver(matrixStack, cMouseX, cMouseY);
         GL11.glPopMatrix();
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
      }

      if (this.Harry.isEmpty()) {
         this.Jacob = false;
      }

      double var10001 = this.William;
      double var10002;
      if (!this.Oscar.isEmpty()) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if (-" ".length() >= "  ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.William = var10001 + var10002;
      this.William = MathUtils.clamp(-3.0D, this.William, 1.5D);
      var10001 = this.Mary;
      if (MathUtils.clamp(0, (int)(this.George.eval((float)(this.William / 6.0D + 0.5D)).y * 255.0F), 255) > 200) {
         var10002 = (double)Global.Oliver.method_1534();
         "".length();
         if ("  ".length() == " ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534());
      }

      this.Mary = var10001 + var10002;
      this.Mary = MathUtils.clamp(-3.0D, this.Mary, 3.0D);
      if (!this.Oscar.isEmpty() && lIlIllIIII(this.William, -1.5D) > 0) {
         String[] lines = this.Oscar.split("\n");
         int tw = 0;
         int th = (int)((float)lines.length * Global.Harry.getGeneric().getHeight("A"));
         String[] var21 = lines;
         int sh = lines.length;
         int xt1 = 0;

         int yt1;
         while(xt1 < sh) {
            String line = var21[xt1];
            yt1 = (int)Global.Harry.getGeneric().getWidth(line);
            if (yt1 > tw) {
               tw = yt1;
            }

            ++xt1;
            "".length();
            if ("  ".length() == 0) {
               return;
            }
         }

         if (Thomas.field_1755 == null) {
            "".length();
            if (null != null) {
               return;
            }

            return;
         }

         int sw = Thomas.field_1755.field_22789;
         sh = Thomas.field_1755.field_22790;
         int var10000;
         if (mouseX + tw + 11 <= sw) {
            var10000 = mouseX + 8;
            "".length();
            if ("   ".length() != "   ".length()) {
               return;
            }
         } else {
            var10000 = mouseX - tw - 8;
         }

         xt1 = var10000;
         int xt2 = xt1 + tw + 3;
         if (mouseY + th - 2 <= sh) {
            var10000 = mouseY - 4;
            "".length();
            if ((47 + 11 - 8 + 90 ^ 59 + 100 - 45 + 22) == 0) {
               return;
            }
         } else {
            var10000 = mouseY - th - 4;
         }

         yt1 = var10000;
         int yt2 = yt1 + th + 5;
         GL11.glPushMatrix();
         int alphabg = (int)(this.George.eval((float)(this.William / 3.0D + 0.5D)).y * 255.0F);
         int alphatxt = (int)(this.George.eval((float)(this.Mary / 6.0D + 0.5D)).y * 255.0F);
         Color bg = ThemeHelper.getColor();
         Color c = ThemeHelper.getFontColor();
         RenderUtils.drawRoundedRectWithShadow((double)xt1, (double)yt1, (double)xt2, (double)yt2, 1.0D, (new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), MathUtils.clamp(0, alphabg, 255))).getRGB(), 0.0D, 0.0D, 15.0D, (new Color(bg.getRed(), bg.getGreen(), bg.getBlue(), MathUtils.clamp(0, alphabg, 255) / 2)).getRGB());
         int i = 0;

         while(i < lines.length) {
            Global.Harry.getGeneric().drawStringWithShadow(lines[i], (double)(xt1 + 2), (double)((float)(yt1 + 2) + (float)i * Global.Harry.getGeneric().getHeight(lines[i])), (new Color(c.getRed(), c.getGreen(), c.getBlue(), MathUtils.clamp(0, alphatxt, 255))).getRGB());
            ++i;
            "".length();
            if ((2 + 46 - 16 + 110 ^ 81 + 42 - 73 + 88) < 0) {
               return;
            }
         }

         GL11.glPopMatrix();
      }

      "".length();
      if ((33 ^ 37) >= (135 ^ 131)) {
         ;
      }
   }

   public void Oliver(int mouseX, int mouseY, int mouseButton) {
      if (mouseButton == 0) {
         this.James = true;
      }

      boolean popupClicked = this.Jack((double)mouseX, (double)mouseY, mouseButton);
      if (!popupClicked) {
         this.Jack(mouseX, mouseY, mouseButton);
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   public void Oliver(class_4587 matrixStack, int mouseX, int mouseY, float partialTicks) {
      double var10001 = this.Patricia;
      double var10002;
      if (!this.Jennifer) {
         var10002 = (double)Global.Oliver.method_1534() * 1.5D;
         "".length();
         if ((25 ^ 30 ^ "   ".length()) < "   ".length()) {
            return;
         }
      } else {
         var10002 = (double)(-Global.Oliver.method_1534()) * 1.5D;
      }

      this.Patricia = var10001 + var10002;
      this.Patricia = MathUtils.clamp(-1.5D, this.Patricia, 1.5D);
      class_4493.method_22078();
      GL11.glDisable(3008);
      GL11.glDisable(3553);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glShadeModel(7425);
      GL11.glLineWidth(1.0F);
      double windowHeight = (double)Global.Oliver.method_22683().method_4502();
      double windowWidth = (double)Global.Oliver.method_22683().method_4486();
      Color c = ThemeHelper.getColor();
      ClickGuiModule clickGuiModule = Global.Jack().Elizabeth;
      if (clickGuiModule.William()) {
         RenderUtils.drawRoundedRect(0.0D, 0.0D, windowWidth, windowHeight, 0.0D, (new Color(c.getRed(), c.getGreen(), c.getBlue(), (int)(153.0D * (double)this.George.eval((float)(this.Patricia / 3.0D + 0.5D)).y))).getRGB());
      }

      double x1;
      double y1;
      if (clickGuiModule.Oscar() != ClickGuiModule.WallPaper.Oliver) {
         Texture texture = clickGuiModule.Oscar().Oliver();
         double scaling = windowHeight / (double)clickGuiModule.Oscar().Oliver().getImage().getHeight() / 1.1D;
         x1 = (double)texture.getImage().getWidth() * scaling;
         y1 = (double)texture.getImage().getHeight() * scaling;
         RenderUtils.drawGradientCircle(windowWidth - 15.0D - x1 / 2.0D, windowHeight - y1 / 2.0D, x1 / 2.0D, 536870912, 0);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, this.George.eval((float)(this.Patricia / 3.0D + 0.5D)).y);
         texture.render(windowWidth - 15.0D - x1, windowHeight - y1, windowWidth - 15.0D, windowHeight);
      }

      if (Global.Jack().Elizabeth.James()) {
         RenderUtils.drawGradientRect(0.0D, -windowHeight * 1.5D, windowWidth, windowHeight, new Color(ThemeManager.getPrimaryColor(500.0D).getRed(), ThemeManager.getPrimaryColor(500.0D).getGreen(), ThemeManager.getPrimaryColor(500.0D).getBlue(), 0), new Color(ThemeManager.getPrimaryColor(1.0D).getRed(), ThemeManager.getPrimaryColor(1.0D).getGreen(), ThemeManager.getPrimaryColor(1.0D).getBlue(), 0), new Color(ThemeManager.getPrimaryColor(500.0D).getRed(), ThemeManager.getPrimaryColor(500.0D).getGreen(), ThemeManager.getPrimaryColor(500.0D).getBlue(), (int)(70.0F * this.George.eval((float)(this.Patricia / 3.0D + 0.5D)).y)), new Color(ThemeManager.getPrimaryColor(1.0D).getRed(), ThemeManager.getPrimaryColor(1.0D).getGreen(), ThemeManager.getPrimaryColor(1.0D).getBlue(), (int)(70.0F * this.George.eval((float)(this.Patricia / 3.0D + 0.5D)).y)));
      }

      double totalHeight;
      if (Global.Thomas.Jack.Harry) {
         String text = "Config is private.";
         String text2 = "You can reset the config to change settings";
         TTFFontRenderer font = Global.Harry.getGeneric();
         x1 = windowWidth / 2.0D - (double)font.getWidth(text2) / 1.9D;
         y1 = windowHeight - 11.0D - (double)font.getHeight(text) - (double)font.getHeight(text2);
         double x2 = windowWidth / 2.0D + (double)font.getWidth(text2) / 1.9D;
         totalHeight = windowHeight - 10.0D;
         boolean var10000;
         if (lIlIlIlllI(x1, (double)mouseX) < 0 && lIlIlIlllI((double)mouseX, x2) < 0 && lIlIlIlllI(y1, (double)mouseY) < 0 && lIlIlIlllI((double)mouseY, totalHeight) < 0) {
            var10000 = true;
            "".length();
            if (-"   ".length() > 0) {
               return;
            }
         } else {
            var10000 = false;
         }

         boolean isHovered = var10000;
         int var10005;
         if (isHovered) {
            var10005 = ThemeHelper.getHoveredColor().getRGB();
            "".length();
            if (-" ".length() >= "   ".length()) {
               return;
            }
         } else {
            var10005 = ThemeHelper.getColor().getRGB();
         }

         RenderUtils.drawRoundedRect(x1, y1, x2, totalHeight, 2.0D, var10005);
         font.drawCenteredString(text, windowWidth / 2.0D, windowHeight - 10.5D - (double)font.getHeight(text) / 2.0D - (double)font.getHeight(text2), ThemeHelper.getFontColor().getRGB());
         font.drawCenteredString(text2, windowWidth / 2.0D, windowHeight - 10.5D - (double)font.getHeight(text2) / 2.0D, ThemeHelper.getFontColor().getRGB());
      }

      this.Oscar = "";
      int minimizedCount = 0;
      Iterator var26 = this.Oliver.iterator();

      do {
         if (!var26.hasNext()) {
            int scWidth = Global.Oliver.method_22683().method_4486();
            int open = 0;
            int closed = 0;
            int i = 0;

            do {
               if (i >= this.Oliver.size()) {
                  if (closed == this.Oliver.size() && lIlIlIllll(this.Patricia, -1.5D) == 0) {
                     Thomas.method_1507((class_437)null);
                  }

                  Iterator var31 = this.Jack.iterator();

                  do {
                     if (!var31.hasNext()) {
                        GL11.glDisable(3553);
                        this.Oliver(matrixStack, mouseX, mouseY);
                        class_4493.method_22076();
                        GL11.glEnable(3553);
                        GL11.glDisable(3042);
                        var31 = this.Harry.iterator();

                        do {
                           if (!var31.hasNext()) {
                              this.Jack.removeIf(AbstractWindow::Linda);
                              "".length();
                              this.Harry.removeIf( MiniMenu ::William);
                              "".length();
                              "".length();
                              if (" ".length() == 0) {
                                 return;
                              }

                              return;
                           }

                           MiniMenu miniMenu = ( MiniMenu )var31.next();
                           if ( miniMenu.Harry().Thomas().Barbara()) {
                              miniMenu.James();
                           }

                           "".length();
                        } while(-" ".length() <= -" ".length());

                        return;
                     }

                     SettingsWindow window = (SettingsWindow)var31.next();
                     this.Oliver(matrixStack, window, mouseX, mouseY, partialTicks);
                     "".length();
                  } while((3 + 153 - 6 + 34 ^ 28 + 1 - -132 + 27) >= 0);

                  return;
               }

               CategoryWindow window = (CategoryWindow)this.Oliver.get(i);
               double amt = (double)(1.0F / Thomas.method_1534());
               int index;
               double h;
               if (this.Jennifer) {
                  if (lIlIlIlllI(window.Jack() - 0.001D, window.Jacob()) <= 0) {
                     ++closed;
                  }

                  if (window.Margaret()) {
                     window.Oliver((-window.Jacob() + window.Jack() * amt) / (amt + 1.0D));
                     index = i - open;
                     totalHeight = (double)minimizedCount * 25.0D + (double)(minimizedCount - 1) * 25.0D / 4.0D;
                     window.Jack(((double)this.Charlie.field_22790 / 2.0D - totalHeight / 2.0D + (double)index * 25.0D + (double)index * 25.0D / 4.0D + window.Harry() * amt) / (amt + 1.0D));
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     ++open;
                     window.Oliver((-window.Jacob() + window.Jack() * amt) / (amt + 1.0D));
                     h = window.Charlie();
                     window.Jack(((double)this.Charlie.field_22790 / 2.0D - h / 2.0D + window.Harry() * amt) / (amt + 1.0D));
                     "".length();
                     if (" ".length() == "   ".length()) {
                        return;
                     }
                  }
               } else if (window.Margaret()) {
                  window.Oliver(((double)scWidth * 0.01D + window.Jack() * amt) / (amt + 1.0D));
                  index = i - open;
                  totalHeight = (double)minimizedCount * 25.0D + (double)(minimizedCount - 1) * 25.0D / 4.0D;
                  window.Jack(((double)this.Charlie.field_22790 / 2.0D - totalHeight / 2.0D + (double)index * 25.0D + (double)index * 25.0D / 4.0D + window.Harry() * amt) / (amt + 1.0D));
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  ++open;
                  window.Oliver(((double)scWidth * 0.02D + CategoryWindow.Thomas + window.Jack() * amt) / (amt + 1.0D));
                  h = window.Charlie();
                  window.Jack(((double)this.Charlie.field_22790 / 2.0D - h / 2.0D + window.Harry() * amt) / (amt + 1.0D));
               }

               this.Oliver(matrixStack, window, mouseX, mouseY, partialTicks);
               ++i;
               "".length();
            } while(" ".length() >= 0);

            return;
         }

         CategoryWindow w = (CategoryWindow)var26.next();
         if (w.Margaret()) {
            ++minimizedCount;
         }

         "".length();
      } while("".length() <= 0);

   }

   public void Oliver() {
      LinkedHashMap<Category, CategoryWindow> windowMap = new LinkedHashMap();
      Category[] var2 = Category.values();
      int y = var2.length;
      int var4 = 0;

      while(var4 < y) {
         Category category = var2[var4];
         windowMap.put(category, new CategoryWindow(category));
         "".length();
         ++var4;
         "".length();
         if ("".length() < "".length()) {
            return;
         }
      }

      Iterator var9 = Global.Jack().Oliver().iterator();

      while(var9.hasNext()) {
         Feature f = (Feature)var9.next();
         if (f.getCategory() != null) {
            ((CategoryWindow)windowMap.get(f.getCategory())).Oliver(new FeatureButton(f));
         }

         "".length();
         if ("".length() > 0) {
            return;
         }
      }

      this.Oliver.addAll(windowMap.values());
      "".length();
      var9 = this.Oliver.iterator();

      while(var9.hasNext()) {
         CategoryWindow window = (CategoryWindow)var9.next();
         window.Oliver(true);
         "".length();
         if ("  ".length() <= 0) {
            return;
         }
      }

      int x = 5;
      y = 5;
      class_1041 sr = Thomas.method_22683();
      Iterator var14 = this.Oliver.iterator();

      CategoryWindow w;
      while(var14.hasNext()) {
         w = (CategoryWindow)var14.next();
         w.Thomas();
         if (lIlIlIIIIl((double)x + w.Jacob() + 5.0D, (double)sr.method_4486()) > 0) {
            x = 5;
            y += 18;
         }

         w.Oliver((double)x);
         w.Jack((double)y);
         x = (int)((double)x + w.Jacob() + 5.0D);
         "".length();
         if (null != null) {
            return;
         }
      }

      var14 = this.Oliver.iterator();

      do {
         if (!var14.hasNext()) {
            "".length();
            if (-(97 ^ 53 ^ 26 ^ 75) >= 0) {
               return;
            }

            return;
         }

         w = (CategoryWindow)var14.next();
         w.Harry(CategoryWindow.Thomas);
         Iterator var7 = w.Oliver.iterator();

         while(var7.hasNext()) {
            PartOfGUI c = ( PartOfGUI )var7.next();
            c.Harry(CategoryWindow.Thomas - 4.0D);
            "".length();
            if ("  ".length() == 0) {
               return;
            }
         }

         "".length();
      } while("".length() < "   ".length());

   }

   private static int lIlIllIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void Oliver(String tooltip) {
      this.Oscar = tooltip;
      "".length();
      if (-" ".length() < 0) {
         ;
      }
   }

   public ClickGui() {
      "".length();
      if (-"   ".length() >= 0) {
         throw null;
      }
   }

   private static int lIlIlIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
