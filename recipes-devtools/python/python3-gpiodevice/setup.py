#!/usr/bin/env python
# -*- coding: utf-8 -*-

import os
import re

from setuptools import setup


def get_long_description():
    """
    Return the README.
    """
    return open("README.md", "r", encoding="utf8").read()


def get_packages(package):
    """
    Return root package and all sub-packages.
    """
    return [
        dirpath
        for dirpath, dirnames, filenames in os.walk(package)
        if os.path.exists(os.path.join(dirpath, "__init__.py"))
    ]


setup(
    name = "gpiodevice",
    url="https://github.com/pimoroni/gpiodevice-python",
    license="MIT",
    description = "Python gpiodevice",
    long_description=get_long_description(),
    long_description_content_type="text/markdown",
    author="Philip Howard",
    author_email="phil@pimoroni.com",
    packages=get_packages("gpiodevice"),
    python_requires=">=3.7",
    include_package_data=True,
    classifiers=[
    "Development Status :: 4 - Beta",
    "Intended Audience :: Developers",
    "License :: OSI Approved :: MIT License",
    "Operating System :: POSIX :: Linux",
    "Programming Language :: Python :: 3",
    "Programming Language :: Python :: 3.7",
    "Programming Language :: Python :: 3.8",
    "Programming Language :: Python :: 3.9",
    "Programming Language :: Python :: 3.10",
    "Programming Language :: Python :: 3.11",
    "Programming Language :: Python :: 3 :: Only",
    "Topic :: Software Development",
    "Topic :: Software Development :: Libraries",
    "Topic :: System :: Hardware",
    ],
)
