/*----------------------------------------------------------------------------*/
/* Copyright (c) 2008-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.wpilib2020.framework.button;


import static frc.wpilib2020.deps.ErrorMessages.requireNonNullParam;

import edu.wpi.first.wpilibj.GenericHID;

/**
 * A {@link Button} that gets its state from a {@link GenericHID}.
 */
public class JoystickButton extends Button {
  private final GenericHID m_joystick;
  private final int m_buttonNumber;

  /**
   * Creates a joystick button for triggering commands.
   *
   * @param joystick     The GenericHID object that has the button (e.g. Joystick, KinectStick,
   *                     etc)
   * @param buttonNumber The button number (see {@link GenericHID#getRawButton(int) }
   */
  public JoystickButton(GenericHID joystick, int buttonNumber) {
    requireNonNullParam(joystick, "joystick", "JoystickButton");

    m_joystick = joystick;
    m_buttonNumber = buttonNumber;
  }

  /**
   * Gets the value of the joystick button.
   *
   * @return The value of the joystick button
   */
  @Override
  public boolean get() {
    return m_joystick.getRawButton(m_buttonNumber);
  }
}
