package com.mikepenz.fastadapter.items

import androidx.recyclerview.widget.RecyclerView

import com.mikepenz.fastadapter.IModelItem

/**
 * Implements the general methods of the IItem interface to speed up development.
 */
@Deprecated("Replace in favor of the more modular ModelBaseItem")
abstract class ModelAbstractItem<Model, VH : RecyclerView.ViewHolder>(override var model: Model) :
        AbstractItem<VH>(), IModelItem<Model, VH>
