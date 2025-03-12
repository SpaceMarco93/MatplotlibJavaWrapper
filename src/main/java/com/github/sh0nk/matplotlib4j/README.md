# This project represents a wrapper for Python Matplotlib.

It is used to plot 2D and 3D figures in Java which lacks of fast and reliable
plotting tools.

The structure of the project is splitted according to the type of plots:
- 2D
- 3D

This is done because of the way the plots are generated using Python.
The 2D plots relies on the less structured way to create plots that is:

```python
import matplotlib.pyplot as plt
import numpy as np

plt.style.use('_mpl-gallery')

# make data
x = np.linspace(0, 10, 100)
y = 4 + 1 * np.sin(2 * x)
x2 = np.linspace(0, 10, 25)
y2 = 4 + 1 * np.sin(2 * x2)

linestyle_tuple = (0, (1, 10))

plt.figure("Titolo Finestra")
plt.plot(x2, y2 + 2.5, marker='x', linewidth=1.0, markeredgecolor="g", linestyle = linestyle_tuple)
plt.xlabel("x", fontsize = 20)
plt.ylabel(ylabel="y")
```

Whenever a 2D plot should be done in Java, the wrapper will translate the Java
code in the last 4 lines written in the Python snippet.

Three-dimensional plots do not allow this way. This is why a more systematic and
ordered way must be implemented to wrap the 3D plots. This is the type of snippet
that is followed as reference for the creation of the plots in Python.

```python
import matplotlib.pyplot as plt
import numpy as np 

# Prepare arrays x, y, z
theta = np.linspace(-4 * np.pi, 4 * np.pi, 100)
z = np.linspace(-2, 2, 100)
r = z**2 + 1
x = r * np.sin(theta)
y = r * np.cos(theta)

ax = plt.figure("Titolo Finestra").add_subplot(projection='3d')
ax.plot(x, y, label='parametric curve', linestyle='--', marker='*')
ax.set_zlabel("z")
ax.legend()
ax.grid(visible=True)
```

In the 3D case, the axes object must be instantiated and all the additional 
methods are defined starting from the axes object. This is a completely different
way to create the plots because it requires an object instantiation that is 
completely avoided in the 2D case. This is why the 3D package is more complicated
to be wrapped, but in turn it is more robust with respect to the 2D one.

# Enumerations
The enums package contains a list of enums that are used to help the user to 
select one of the possible options if does not know the commands in Python. 
Indeed, the enums contain a constant that is suggesting the type of option and
there will be an internal conversion from the enum option to the string that is
used in Python to invoke that option.

# Structure
In each package dedicated to the 2D or 3D plots there is a specific structure 
that is followed for the realization of the wrapping:
- builder
- kwargs
- main wrapper
In the builder subpackage there is the list of all the functions to be wrapped
at the higher level.
In the kwargs subpackage there is the list of all the arguments of type (key=value)
to be passed for each function.
A practical example is the following:

```python
plt.figure("Titolo Finestra")
plt.plot(x2, y2 + 2.5, marker='x', linewidth=1.0, markeredgecolor="g", linestyle = linestyle_tuple)
plt.xlabel("x", fontsize = 20)
plt.ylabel(ylabel="y")
```

In this snippet, it is possible to check that the keywords "plot", "xlabel", "ylabel"
represent the higher level functions. Therefore, if there is a specific builder
that is associated to them it will be defined inside the package "builder".
The words "linewidth", "markeredge", "linestyle", "fontsize" are the additional
arguments following the form (key=value) and this is why their implementation is
defined inside the package "kwargs".

Another important difference that is derived from the previous classification is
in the definition of the "build" method. Indeed, it is possible to understand that
for some methods it will be enough to follow the pattern "plt.method("Argument")".
For other methods the pattern that is followed is "plt.method("argument", key=value).
The methods that will follow the first pattern, that is they are not requiring 
the **kwargs, the "build" method will be of the type belonging to the ArgsBuilderImpl
Java class.
In case the methods can accept **kwargs the "build" method to be called should be
the one defined in the CompositeBuilderImpl Java class. 
This is important to understand the inheritances and the workflow that if followed
from the call of the "plt.show()" method to the translation in the Python language.

# Argument vs kwargs
After the previous description it is clear that an argument can be defined as an
input that is passed without a keyword, while a kwarg is an argument that is passed
together with a keywork. However, some higher level methods accepts also for the
arguments a notation similar to "key=value". In this case, it is used the "kwargs"
notation also for the arguments because it is easier to wrap the option. Indeed,
in case there is no keyword, it is important to respect a dedicated order for the 
call to the higher order method that requires multiple constructors that are 
respecting the order of the variables to be passed.