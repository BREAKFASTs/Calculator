import javax.swing.*;

public class Calculator extends JFrame {

    // ==================================================
    // MEMBER 1 - MAIN APP STRUCTURE
    // ==================================================

    public Calculator() {

        // TODO:
        // - Set title of window
        // - Set size (around 500x600)
        // - Center window on screen
        // - Set close operation (EXIT_ON_CLOSE)

        // TODO:
        // - Create JTabbedPane

        // TAB STRUCTURE:
        // - Add "Basic Calculator" tab → BasicCalculator panel
        // - Add "Scientific Calculator" tab → ScientificCalculator panel
        // - Add "Converter" tab → ConverterCalculator panel

        // TODO:
        // - Add tabs to JFrame
    }

    // ==================================================
    // MEMBER 2 YLAIZA MONGAS - BASIC CALCULATOR (TAB 1) 
    // ==================================================

    static class BasicCalculator extends JPanel {

        // UI COMPONENTS:
        // - JLabel display (main number)
        // - JLabel history (expression shown above)

        // VARIABLES TO CREATE:
        // - double firstNumber
        // - String operator (+ - * /)
        // - boolean isNewInput

        public BasicCalculator() {

            // TODO UI SETUP:
            // - set layout BorderLayout

            // TOP AREA:
            // - history label (small font, right aligned)
            // - display label (large font, bold, right aligned)

            // BUTTON GRID (5x4):
            // Buttons:
            // 7 8 9 /
            // 4 5 6 *
            // 1 2 3 -
            // 0 00 . +
            // C ± % =

            // ==================================================
            // LOGIC GUIDE:
            // ==================================================

            // NUMBER BUTTONS:
            // - append number to display
            // - if isNewInput == true → reset display first

            // OPERATOR BUTTONS (+ - * /):
            // - store current display as firstNumber
            // - store operator
            // - set isNewInput = true
            // - update history label (example: "12 +")

            // EQUAL BUTTON (=):
            // - read second number from display
            // - perform operation using stored operator
            // - show result in display
            // - update history ("12 + 5 =")

            // CLEAR BUTTON (C):
            // - reset display to 0
            // - reset history
            // - reset stored values

            // ERROR HANDLING:
            // - if divide by zero → show "Error"
        }
    }

    // ==================================================
    // MEMBER 3 - SCIENTIFIC CALCULATOR (TAB 2)
    // ==================================================

    static class ScientificCalculator extends JPanel {

        // VARIABLES:
        // - boolean DEG_MODE = true

        public ScientificCalculator() {

            // TODO UI:
            // - display label (right aligned)
            // - mode label (DEG / RAD indicator)

            // BUTTONS:
            // sin cos tan DEG/RAD
            // sin⁻¹ cos⁻¹ tan⁻¹ π
            // x² x³ xʸ √
            // log ln 1/x n!
            // numbers + operators

            // ==================================================
            // LOGIC GUIDE:
            // ==================================================

            // DEG / RAD BUTTON:
            // - toggle DEG_MODE
            // - update label text

            // TRIG FUNCTIONS:
            // if DEG_MODE:
            //   convert input using Math.toRadians()
            // else:
            //   use directly

            // sin:
            //   Math.sin(value)

            // cos:
            //   Math.cos(value)

            // tan:
            //   Math.tan(value)

            // INVERSE TRIG:
            // if DEG_MODE:
            //   convert result using Math.toDegrees()

            // POWER:
            // x² → value * value
            // x³ → value * value * value
            // xʸ → Math.pow(a, b)

            // SQRT:
            // - if negative → Error

            // LOG:
            // - log(0) → Error
            // - Math.log10(value)

            // LN:
            // - ln(0) → Error
            // - Math.log(value)

            // FACTORIAL:
            // - only integer >= 0
        }
    }

    // ==================================================
    // MEMBER 4 - NUMBER SYSTEM CONVERTER (TAB 3)
    // ==================================================

    static class ConverterCalculator extends JPanel {

        // INPUT FIELDS:
        // - dec (base 10)
        // - bin (base 2)
        // - oct (base 8)
        // - hex (base 16)

        public ConverterCalculator() {

            // TODO UI:
            // - labels for each base
            // - text fields for input

            // ==================================================
            // LOGIC GUIDE:
            // ==================================================

            // WHEN DEC ENTERED:
            // - parse decimal
            // - convert to:
            //   BIN → Integer.toBinaryString()
            //   OCT → Integer.toOctalString()
            //   HEX → Integer.toHexString().toUpperCase()

            // WHEN BIN ENTERED:
            // - Integer.parseInt(value, 2)
            // - update others

            // WHEN OCT ENTERED:
            // - Integer.parseInt(value, 8)

            // WHEN HEX ENTERED:
            // - Integer.parseInt(value, 16)

            // ERROR HANDLING:
            // - invalid input → highlight field red
            // - do NOT crash program

            // IMPORTANT:
            // - HEX must always be uppercase
        }
    }

    // ==================================================
    // MEMBER 5 - MAIN METHOD
    // ==================================================

    public static void main(String[] args) {

        // TODO:
        // - use SwingUtilities.invokeLater
        // - create Calculator object
        // - set visible = true
    }
}