// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class CameraVision {
    public final String cameraName = "camera";
    public final int ViewportWidth = 640;
    public final int ViewportHeight = 480;
}

  public static final int kDriverControllerPort = 0;
  //Drive train
  public static int leftFront = 3; 
  public static int leftBack = 4;
  public static int rightFront = 1;
  public static int rightBack = 2;

  //Driverstation ports 
  public static int joystickPort = 0;//USB port on driver station computer
  public static int xboxPort = 1;

  // lmao


}

