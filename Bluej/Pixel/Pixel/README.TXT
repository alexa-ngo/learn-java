- Color class in the Java library
    -> Red, Blue, Green (0, 255)
    
- Pixel class class that contains a Color class that can return:
    -> red (getRed())
    -> blue (getBlue())
    -> green (getGreen())
    -> print that will print the colors in format "(R, G, B)"
    
    -> toJSON() -> string
    
    public string toJSON() {
    }
    
{r: 199, g: 192,b: 30}


///

public void brighten(int delta) {
    //
}

1. grab the current r,g,b values in the color object
2. save them in temporary variables
3. manipulate them to brighten
4. create a new color object and assign it to the pixel's _color member

Pixel p = new...

p.toJSON();
p.brigten(10);
p.toJSON();